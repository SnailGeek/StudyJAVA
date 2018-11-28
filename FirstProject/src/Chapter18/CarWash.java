package Chapter18;
import java.util.*;
import static net.mindview.util.Print.*;

public class CarWash
{
    public enum Cycle
    {
        UNDERBODY
                {
                    void action(){print("Spraying the underbody");}
                },
        WHEELWASH
                {
                    void action() {print("Washing the wheels");}
                },
        PREWASH
                {
                    void action() {print("Loosening the dirt");}
                },
        BASIC
                {
                    void action() {print("the basic wash");}
                };
        abstract void action();
    }
    EnumSet<Cycle> cycles = EnumSet.of(Cycle.BASIC, Cycle.PREWASH);
    public void add(Cycle cyle){cycles.add(cyle); }
    public void wash()
    {
        for(Cycle c: cycles)
            c.action();
    }
    public String toString()
    {
        return cycles.toString();
    }
    public static void main(String[] args)
    {
        CarWash wash = new CarWash();
        print(wash);
        wash.wash();
        wash.add(Cycle.BASIC);
        wash.add(Cycle.UNDERBODY);
        print(wash);
        wash.wash();
    }
}
