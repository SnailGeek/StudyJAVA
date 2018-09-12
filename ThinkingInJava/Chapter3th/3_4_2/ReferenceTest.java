import java.util.*;
public class  ReferenceTest
{
	public static void main(String[] args) 
	{
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		t1.level = 1;
		t2.level = 2;
		System.out.println("t1.level= " + t1.level +
			"  t2.level= " + t2.level);
		t1 = t2;
		System.out.println("t1.level= " + t1.level +
			"  t2.level= " + t2.level);
		t1.level = 50;
		System.out.println("t1.level= " + t1.level +
			"  t2.level= " + t2.level);

	}
}

class Tank
{
	float level;
}

