import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Memorize1<A, V> implements Computable<A, V>
{
    private Map<A, V> cache = new ConcurrentHashMap<>();
    private Computable c;
    Memorize1(Computable c)
    {
        this.c = c;
    }
    @SuppressWarnings("unchecked")
    public V compute(A arg) throws Exception
    {
        V result = cache.get(arg);
        if (result == null)
        {
            result = (V)c.compute(arg);
            cache.put(arg, result);
        }
        return result;
    }
}
