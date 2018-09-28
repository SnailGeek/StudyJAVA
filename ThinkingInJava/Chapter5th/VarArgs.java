import java.util.*;
public class VarArgs
{
	static void printArray(Object[] args)
	{
		for(Object obj : args)
		{
			System.out.println(obj + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		printArray(new Object[]{new Integer(478)});
		printArray(new Object[]{"one"});
		printArray(new Object[]{new A()});
	}
}
class A{}

