package Chapter18;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

import static net.mindview.util.Print.*;
import static Chapter18.Input.*;
import net.mindview.util.*;

enum Category
{
    MOKEY(NICKEL, DIME, QUARTER, DOLLAR),
    ITEM_SELECTION(TOOTHPASTE, CHIPS, SODA, SOAP),
    QUIT_TRASACTION(ABORT_TRANSACTION),
    SHUT_DOWN(STOP);
    private Input[] values;
    Category(Input... types)
    {
        values = types;
    }
    private static EnumMap<Input, Category> categories =
            new EnumMap<Input, Category>(Input.class);
    static
    {
        for(Category c :Category.class.getEnumConstants())
            for(Input type : c.values)
                categories.put(type, c);
    }
    public static Category categorize(Input input)
    {
        return categories.get(input);
    }
}

public class VendingMachine
{
    private static class Context
    {
        private State state = State.RESTING;
        private int amount = 0;
        private Input selection = null;
    }
    private static Map<Machine, Context> em = Collections.synchronizedMap(
            new EnumMap<Machine, Context>(Machine.class));
    static
    {
        for (Machine m : Machine.values())
            em.put(m, new Context());
    }

    enum Machine {M1, M2, M3}

    private static final ReentrantLock lock = new ReentrantLock();

    private static State state = State.RESTING;
    private static int amount = 0;
    private static Input selection = null;
    enum StateDuration{TRANSIENT}
    enum State
    {
        RESTING
                {
                    void next(Input input)
                    {
                        switch (Category.categorize(input))
                        {
                            case MOKEY:
                                amount += input.amount();
                                state = ADDING_MONKEY;
                                break;
                            case SHUT_DOWN:
                                state = TERMINAL;
                            default:
                        }
                    }
                },
        ADDING_MONKEY
                {
                    void next(Input input)
                    {
                        switch (Category.categorize(input))
                        {
                            case MOKEY:
                                amount += input.amount();
                                break;
                            case ITEM_SELECTION:
                                selection = input;
                                if (amount < selection.amount())
                                    print("Insufficient money for " + selection);
                                else
                                    state = DISPENSING;
                                break;
                            case QUIT_TRASACTION:
                                state = GIVING_CHANGE;
                                break;
                            case SHUT_DOWN:
                                state = TERMINAL;
                            default:
                        }
                    }
                },
        DISPENSING(StateDuration.TRANSIENT)
                {
                    void next()
                    {
                        print("here is your" + selection);
                        amount -= selection.amount();
                        state = GIVING_CHANGE;
                    }
                },
        GIVING_CHANGE(StateDuration.TRANSIENT)
                {
                    void next()
                    {
                        if (amount > 0)
                        {
                            print("Your change: " + amount);
                            amount = 0;
                        }
                        state = RESTING;
                    }
                },
        TERMINAL
                { void output(){print("Hlted");}};
        private boolean isTransient = false;
        State(){}
        State(StateDuration trans)
        {
            isTransient = true;
        }
        void next(Input input)
        {
            throw new RuntimeException("Only Call" + "next(Input input) for non-transient states");
        }
        void next()
        {
            throw new RuntimeException("Only Call next() for StateDuration.TRANSIENT states");
        }
        void output()
        {
            print(amount);
        }
    }
    static void run(Generator<Input> gen, Machine m)
    {
        Context ctx = em.get(m);

        while(state != State.TERMINAL)
        {
            lock.lock();
            state = ctx.state;
            amount = ctx.amount;
            selection = ctx.selection;
            try
            {
                state.next(gen.next());
                state.next(gen.next());
                while(state.isTransient)
                    state.next();
                state.output();
                ctx.state = state;
                ctx.amount = amount;
                ctx.selection = selection;
                em.put(m, ctx);
            }
            finally {
                lock.unlock();
            }
            Thread.yield();
        }
    }
    public static void main(String[] args)
    {
        for(final VendingMachine.Machine m : VendingMachine.Machine.values())
        {
            Generator<Input> gen = new RandomInputGenerator();

            gen = new FileInputGenerator("G:\\TempData\\VendingMachineInput.txt");
            final Generator<Input> g = gen;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    VendingMachine.run(g,m);
                }
            }).start();
        }
    }
}


class RandomInputGenerator implements Generator<Input>
{
    public Input next()
    {
        return Input.randomSelection();
    }
}
class FileInputGenerator implements Generator<Input>
{
    private Iterator<String> input;
    public FileInputGenerator(String fileName)
    {
        input = new TextFile(fileName, ";").iterator();
    }
    public Input next()
    {
        if(!input.hasNext())
            return null;
        return Enum.valueOf(Input.class, input.next().trim());
    }
}
