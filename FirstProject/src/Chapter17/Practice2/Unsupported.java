package Chapter17.Practice2;

import java.util.*;

public class Unsupported
{
    static void test(String msg, List<String> list)
    {
        System.out.println("--- " + msg + " ----");
        Collection<String> c = list;
        Collection<String> sublist = list.subList(1, 8);

        Collection<String> c2 = new ArrayList<>(sublist);
        try
        {
            c.retainAll(c2);
        }
        catch (Exception e)
        {
            System.out.println("c.retainAll(): " + e);
        }

        try {c.removeAll(c2);} catch (Exception e)
        { System.out.println("c.removeAll(): " + e);}

        try {c.clear();} catch (Exception e)
        { System.out.println("c.clear(): " + e);}

        try {c.add("x");} catch (Exception e)
        { System.out.println("c.add(): " + e);}

        try {c.addAll(c2);} catch (Exception e)
        { System.out.println("c.addAll(): " + e);}

        try {c.remove("C");} catch (Exception e)
        { System.out.println("c.remove(): " + e);}

        try
        {
            list.set(0, "X");
        }
        catch (Exception e)
        {
            System.out.println("list.set(): " + e);
        }
    }
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modefiable Copy", new ArrayList<>(list));
        test("Arrays.asList()", list);
        test("unModefiableList()", Collections.unmodifiableList(new ArrayList<>(list)));
    }
}
