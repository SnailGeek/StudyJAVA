import java.util.*;

public class GenericityTest
{
	public static void main(String[] args) 
	{
		Genericity<String> g1 = new Genericity<String>("hello");
		System.out.println(g1.getGenericity());
		Genericity<Integer> g2 = new Genericity<Integer>(1);
		System.out.println(g2.getGenericity());
	}
}

class Genericity<T>
{
	private T key;
	Genericity(T key)
	{
		this.key = key;
	}
	public T getGenericity()
	{
		return key;
	}
}