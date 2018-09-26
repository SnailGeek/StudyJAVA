public class  Test7And10
{
	public static void main(String[] args) 
	{
		Steam st = new Steam(8888);
	}
}

class Component1
{
	Component1(int i)
	{
		System.out.println("constructor component1 " + i);
	}
}

class Component2
{
	Component2(int i)
	{
		System.out.println("constructor component2 " + i);
	}
}

class Component3
{
	Component3(int i)
	{
		System.out.println("constructor component3 " + i);
	}
}

class Root
{
	Component1 com1 = new Component1(1);
	Component2 com2 = new Component2(2);
	Component3 com3 = new Component3(3);
	Root(int i)
	{
		System.out.println("Root constructor " + i);
	}
}

class Steam extends Root
{
	Component1 com1 = new Component1(1);
	Component2 com2 = new Component2(2);
	Component3 com3 = new Component3(3);
	Steam(int i)
	{
		super(i);
		System.out.println("Steam constructor " + i);
	}
}