package Chapter17.Practice2;
import net.mindview.util.TextFile;
import java.util.*;
public class Practice12
{
    public static void main(String[] args)
    {
        List<String> words =
                new TextFile("E:\\StudyJAVA\\FirstProject\\src\\Chapter17\\Practice2\\AssociativeArray.java", "\\W+");
        AssociativeArray<String, Integer> mapWordCount = new AssociativeArray<>(words.size());
        Iterator<String> it = words.iterator();
        while (it.hasNext())
        {
            String key = it.next();
            Integer count = mapWordCount.getKey(key);
            if (count == null)
                mapWordCount.put(key, 1);
            else
                mapWordCount.put(key, ++count);
        }
        System.out.println(mapWordCount);
    }

}
