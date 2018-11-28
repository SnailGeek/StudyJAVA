package Chapter17.Practice2;
import java.util.*;
import static net.mindview.util.Countries.*;
public class Practice2
{
    public static void main(String[] args)
    {
        List<String> countries = new ArrayList<>(names());
        Map<Integer, String> aCountry = new HashMap<>();
        Set<String> aCountrySet = new HashSet<>();
        Set<String> aTreeSet = new TreeSet<>();
        Set<String> aLinkedHashSet = new LinkedHashSet<>();
        int key  = 1;
        for (String name : countries)
        {
            if (name.charAt(0) == 'A')
            {
                aCountry.put(key++, name);
                aCountrySet.add(name);
                aCountrySet.add(name);

                aTreeSet.add(name);
                aTreeSet.add(name);

                aLinkedHashSet.add(name);
                aLinkedHashSet.add(name);

            }
        }
        System.out.println(aCountry);
        System.out.println(aCountrySet);
        System.out.println(aTreeSet);
        System.out.println(aLinkedHashSet);
    }


}
