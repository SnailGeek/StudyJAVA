package object;
import java.util.*;
public class E01_DefalutInitialization
{
    private int count;
    private char c;
    public int getCount()
    {
        return count;
    }
    public char getC()
    {
        return c;
    }

    public static void main(String[] args)
    {
        E01_DefalutInitialization instance = new E01_DefalutInitialization();
        System.out.println("Default char: " + instance.getC());
        System.out.println("Default int: " + instance.getCount());

    }
}
