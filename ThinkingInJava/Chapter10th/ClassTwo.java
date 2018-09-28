package practice6;
import practice6.*;
public class  ClassTwo extends ClassOne
{
	interfaceTest makeClass()
	{
		return new InnerOne();
	}

	public static void main(String[] args) 
	{
		ClassTwo clt = new ClassTwo();
		interfaceTest inner = clt.makeClass();
		inner.print();
	}
}
