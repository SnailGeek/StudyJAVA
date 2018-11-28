package Chapter17.Practice2;

import java.util.*;

public class Practice11
{
    public static void main(String[] args)
    {
        PriorityQueue<Item> queue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++)
            queue.add(new Item());
        Item item;
        while ((item = queue.poll()) !=null)
        {
            System.out.println(item);
        }
    }
}

class Item implements Comparable<Item>
{
    private static final Random rand = new Random(47);
    private Integer item = rand.nextInt(100);
    public int compareTo(Item arg)
    {
        if (item > arg.item)
            return +1;
        else if(item == arg.item)
            return 0;
        else
            return -1;
    }
    public String toString()
    {
        return Integer.toString(item);
    }
}
