package Chapter18;

import java.util.EnumMap;
import java.util.Map;

import static Chapter18.AlarmPoints.*;
import static net.mindview.util.Print.*;

interface Command{void action();}

public class EnumMaps
{
    public static void main(String[] args)
    {
        EnumMap<AlarmPoints, Command> em =
                new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                print("Kitchen fire!");
            }
        });
        em.put(TAIR, new Command() {
            @Override
            public void action() {
                print("Tair alert!");
            }
        });

        em.put(OFFICE, new Command() {
            @Override
            public void action() {
                print("Office fire!");
            }
        });
        for (Map.Entry<AlarmPoints, Command> e : em.entrySet())
        {
            printnb(e.getKey() + ": ");
            e.getValue().action();
        }
        try
        {
            em.get(TAIR).action();
        }
        catch (Exception e)
        {
            print(e);
        }

    }
}
