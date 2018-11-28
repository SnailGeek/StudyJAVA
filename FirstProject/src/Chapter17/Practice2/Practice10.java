package Chapter17.Practice2;
import java.util.*;
import static net.mindview.util.Print.*;
import static java.util.Collections.binarySearch;

//class CustomSortedSet<T> implements SortedSet<T> {
//    private final List<T> list;
//
//    public CustomSortedSet()
//    {
//        list = new LinkedList<>();
//    }
//    private CustomSortedSet(List<T> list)
//    {
//        this.list = list;
//    }
//    public String toString()
//    {
//        return list.toString();
//    }
//
//    public int size()
//    {
//        return list.size();
//    }
//    public boolean isEmpty()
//    {
//        return list.isEmpty();
//    }
//    @SuppressWarnings("unchecked")
//    public boolean contains(Object obj)
//    {
//        checkForNull(obj);
//        return binarySearch((List<Comparable<T>>)list, (T)obj) >= 0;
//    }
//    public Iterator<T> iterator()
//    {
//        return list.iterator();
//    }
//    public Object[] toArray()
//    {
//        return list.toArray();
//    }
//    public <T> T[] toArray(T[] a)
//    {
//        return list.toArray(a);
//    }
//    @SuppressWarnings("unchecked")
//    public boolean add(T o)
//    {
//        checkForNull(o);
//        int ip = binarySearch((List<Comparable<T>>)list, o);
//        if (ip < 0)
//        {
//            ip = -(ip+1);
//            if(ip == list.size())
//                list.add(o);
//            else
//                list.add(ip, o);
//            return true;
//        }
//        return false;
//    }
//    public boolean remove(Object o)
//    {
//        checkForNull(o);
//        return list.remove(o);
//    }
//}
//
//public class Practice10
//{
//}
