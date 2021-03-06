public class CycleTest 
{
	static void ride(Cycle c)
	{
		c.test();
	}
	public static void main(String[] args) 
	{
		Unicycle un = new Unicycle();
		ride(un);

		Bicycle bi = new Bicycle();
		ride(bi);
	}
}

class Cycle
{
	public void test()
	{
		System.out.println("Cycle");
	}
}

class Unicycle extends Cycle
{
	@Override
	public void test()
	{
		System.out.println("Unicycle");
	}
}

class Bicycle extends Cycle
{
	@Override
	public void test()
	{
		System.out.println("Bicycle");
	}
}