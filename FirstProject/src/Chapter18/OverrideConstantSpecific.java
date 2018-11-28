package Chapter18;
import static net.mindview.util.Print.*;

public enum OverrideConstantSpecific
{
    NUT, BOLT,
    WASHER{
        void f() {print("Overriden method");}
    };
    void f(){print("defautl behavior");}
    public static void main(String[] args)
    {
        for (OverrideConstantSpecific ocs : values())
        {
            printnb(ocs + ": ");
            ocs.f();
        }
    }


}
