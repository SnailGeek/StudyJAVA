package helloworld;
import java.util.* ;

public class Practice28 {
    public static void main(String[] args)
    {
        PriorityQueue<Double> pQueue = new PriorityQueue<>();
        Random rand = new Random(40);
        for(int i = 0; i < 10 ; i++)
        {
            pQueue.offer(rand.nextDouble());
        }
        while(pQueue.peek() != null)
        {
            System.out.println(pQueue.poll());
        }
    }
}
