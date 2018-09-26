
class PackagedClass 
{
	public PackagedClass()
	{
		System.out.println("Creating a packaged class");
	}
}

public class  Foreign
{
	public static void main(String[] args) 
	{
		PackagedClass pc = new PackagedClass();
	}
}
