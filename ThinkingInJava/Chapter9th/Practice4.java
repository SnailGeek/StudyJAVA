public class Practice4 
{
	public static void testPirnt(ParentClass cc)
	{
		cc.print();
	}
	public static void main(String[] args) 
	{
		ChildClass ss = new ChildClass();
		testPirnt(ss);
	}
}

abstract class ParentClass
{
	public abstract void print();
}

class ChildClass extends ParentClass
{
	public void print()
	{
		System.out.println("ChildClass");
	}

}
