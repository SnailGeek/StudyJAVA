class  Beetle extends Insect
{
	protected int k = printInit("Beetle.k initilized");
	public Beetle()
	{
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = 
		printInit("Static Bettle.x2 initialized");
	//public static void main(String[] args) 
	//{
	//	System.out.println("Beetle constructor");
	//	Beetle b = new Beetle();
	//}
}

class Insect
{
	private int i = 0;
	protected int j;
	Insect()
	{
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = 
		printInit("Static insect.x1 initialized");
	static int printInit(String s)
	{
		System.out.println(s);
		return 47;
	}
}

class BeetleWorm extends Beetle
{
	private int m = printInit("BeetleWorm.m initilized");
	public BeetleWorm()
	{
		System.out.println("k = " + k);
		System.out.println("j = " + j);
		System.out.println("m = " + m);
	}
	private static int x3 = 
		printInit("Static BettleWorm.x3 initialized");
	public static void main(String[] args) 
	{
		System.out.println("BeetleWorm constructor");
		BeetleWorm b = new BeetleWorm();
	}
}
