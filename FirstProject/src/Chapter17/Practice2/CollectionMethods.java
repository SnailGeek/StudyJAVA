package Chapter17.Practice2;
import net.mindview.util.Countries;

import java.util.*;
import static net.mindview.util.Countries.*;
import static net.mindview.util.Print.*;

public class CollectionMethods
{
    public static void  main(String[] args)
    {
        Collection<String> c = new ArrayList<>();
        c.addAll(names(6));
        c.add("ten");
        c.add("eleven");
        print(c);

        Object[] array = c.toArray();
        String[] str = c.toArray(new String[0]);
        print("Collection.max(c) = " + Collections.max(c));
        print("Collections.min(c) = " + Collections.min(c));

        Collection<String> c2 = new ArrayList<>();
        c2.addAll(Countries.names(6));
        c.addAll(c2);
        print(c);

        c.remove(Countries.DATA[0][0]);
        print(c);
        c.remove(Countries.DATA[1][0]);
        print(c);

        c.removeAll(c2);
        print(c);

        c.addAll(c2);
        print(c);

        print("c2.isEmpty() = " + c2.isEmpty());
        c = new ArrayList<>();
        c.addAll(Countries.names(6));

        print(c);
        c.clear();
        print("after c.clear(): " + c);
    }
}
