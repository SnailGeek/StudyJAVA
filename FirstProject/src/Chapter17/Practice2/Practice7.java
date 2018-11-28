package Chapter17.Practice2;

import net.mindview.util.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class Practice7
{
    public static void main(String[] ags)
    {
        List<String> arrayList = new ArrayList<>(Countries.names());
        List<String> linkedList = new LinkedList<>(Countries.names());

        Iterator<String> arrayIt = arrayList.iterator();
        Iterator<String> linkedIt = linkedList.iterator();

        while(arrayIt.hasNext())
        {
            printnb(arrayIt.next() + " ");
        }
        print();
        while (linkedIt.hasNext())
        {
            printnb(linkedIt.next() + " ");
        }
        print();
        ListIterator<String> lit = arrayList.listIterator();
//        ListIterator<String> linkedLit = linkedList.listIterator();
        int index = 1;
        while(lit.hasNext())
        {
            linkedList.add(index, lit.next());
            index += 2;
        }
        print(linkedList);
    }
}
