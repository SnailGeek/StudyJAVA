package Chapter17.Practice2;

import java.util.concurrent.*;
import java.util.*;
import net.mindview.util.*;

public class QueueBehavior
{
    private static int count = 8;
    static <T> void test(Queue<T> queue, Generator<T> gen)
    {
        for(int i = 0; i < count; i++)
        {
            queue.offer(gen.next());
        }
        while (queue.peek() != null)
        {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    static class Gen implements Generator<String>
    {
        String[] s = ("One two three four five six seven eight").split(" ");
        int i = 0;
        public String next()
        {
            return s[i++];
        }
    }
    public static void main(String[] args)
    {
        test(new LinkedList<>(), new Gen());
        test(new PriorityQueue<>(), new Gen());
        test(new ArrayBlockingQueue<>(count), new Gen());
        test(new ConcurrentLinkedDeque<>(), new Gen());
        test(new LinkedBlockingQueue<>(), new Gen());
        test(new PriorityBlockingQueue<>(), new Gen());
    }
}
