import java.util.*;

public class  FunctionReferenceTest
{
	static void f(Tank k)
	{
		k.level = 15;
	}
	public static void main(String[] args) 
	{
		Tank t1 = new Tank();
		System.out.println("t1.level = " + t1.level);
		f(t1);
		System.out.println("t1.level = " + t1.level);
	}
}

class Tank
{
	float level;
}
