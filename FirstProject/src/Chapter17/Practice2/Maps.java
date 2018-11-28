package Chapter17.Practice2;
import net.mindview.util.CountingMapData;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static net.mindview.util.Print.*;

public class Maps
{
    public static void printKeys(Map<Integer, String> map)
    {
        printnb("Size = " + map.size());
        printnb("Keys: ");
        print(map.keySet());
    }
    public static void test(Map<Integer, String> map)
    {
        print(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        printKeys(map);

        printnb("Values: ");
        print(map.values());

        print(map);
        print("map.containsKey(11): " + map.containsKey(11));
        print("map.get(11): " + map.get(11));

        print("map.containsValue(\"F0\"): " + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        print("FirstKey: " + key);
        map.remove(key);
        printKeys(map);
        map.clear();
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        print("map.isEmpty(): " + map.isEmpty());
    }
    public static void main(String[] args)
    {
        test(new HashMap<>());
        print("=============================================================");
        test(new TreeMap<>());
        print("=============================================================");
        test(new LinkedHashMap<>());
        print("=============================================================");
        test(new IdentityHashMap<>());
        print("=============================================================");
        test(new ConcurrentHashMap<>());
        print("=============================================================");
        test(new WeakHashMap<>());
    }

}
