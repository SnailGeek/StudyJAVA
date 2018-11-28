package util;

import java.util.*;
public class Tools
{
    public static void randomPause(int time)
    {
        Random r = new Random();
        try
        {
            Thread.currentThread().sleep(r.nextInt(time));
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
