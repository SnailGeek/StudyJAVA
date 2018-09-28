public class  Cartoon extends Drawing
{
	//public Cartoon()
	//{
	//	System.out.println("Cartoon constructor");
	//}
	Drawing d = new Drawing();
	public static void main(String[] args) 
	{
		Cartoon c = new Cartoon();
	}
}

class Art
{
	Art()
	{
		System.out.println("Art constructor");
	}
}

class Drawing extends Art
{
	Drawing()
	{
		System.out.println("Drawing Constructor");
	}
}