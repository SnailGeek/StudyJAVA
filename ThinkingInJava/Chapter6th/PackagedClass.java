package access.local;
class PackagedClass 
{
	public static void main(String[] args) 
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


