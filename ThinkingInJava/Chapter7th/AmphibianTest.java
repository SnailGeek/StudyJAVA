public class  AmphibianTest
{
	public static void main(String[] args) 
	{
		Frog f = new Frog();
		Amphibian.Test(f);
	}
}

class Amphibian
{
	public void setRed()
	{
		System.out.println("Parent Class setRed");
	}
	static void Test(Amphibian parent)
	{
		parent.setRed();
	}
}

class Frog extends Amphibian
{
	public void setRed()
	{
		System.out.println("Child Class setRed");
	}
}
