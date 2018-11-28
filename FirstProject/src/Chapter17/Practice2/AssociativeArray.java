package Chapter17.Practice2;

public class AssociativeArray<K, V>
{
    private Object[][] pairs;
    private int index;
    AssociativeArray(int length)
    {
        pairs = new Object[length][2];
    }
    public void put(K key, V v)
    {
        for (int i = 0; i < index; i++)
        {
            if (key.equals(pairs[i][0]))
            {
                pairs[i] = new Object[] {key, v};
                return;
            }
        }
        if (index > pairs.length)
            throw new ArrayIndexOutOfBoundsException();
        pairs[index++] = new Object[]{key,v};
    }

    @SuppressWarnings("unchecked")
    public V getKey(K key)
    {
        for (int i = 0; i < pairs.length; i++)
        {
            if (key.equals(pairs[i][0]))
                return (V)pairs[i][1];
        }
        return null;
    }
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pairs.length; i++)
        {
            if (pairs[i][0] != null)
            {
                result.append(pairs[i][0].toString());
                result.append(" : ");
                result.append(pairs[i][1].toString());
                if (i < index -1)
                    result.append("\n");
            }
        }
        return result.toString();
    }
}
