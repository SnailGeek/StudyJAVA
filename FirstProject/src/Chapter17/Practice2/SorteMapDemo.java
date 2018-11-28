package Chapter17.Practice2;

import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class SorteMapDemo
{
    public static void main(String[] args)
    {
        TreeMap<Integer, String> sorteMap = new TreeMap<>(new CountingMapData(10));
        print(sorteMap);
        Integer low = sorteMap.firstKey();
        Integer high = sorteMap.lastKey();
        print(high);
        Iterator<Integer> it = sorteMap.keySet().iterator();
        for (int i = 0; i <= 6; i++)
        {
            if (i == 3)
                low = it.next();
            if (i == 6)
                high = it.next();
            else
                it.next();
        }
        print(low);
        print(high);
        print(sorteMap.subMap(low, high));
        print(sorteMap.headMap(high));
        print(sorteMap.tailMap(low));
    }


}
