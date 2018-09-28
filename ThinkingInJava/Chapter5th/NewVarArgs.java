/*import java.util.*;
public class NewVarArgs 
{
	static void printArray(Object... args)
	{
		for(Object arg : args)
			System.out.print(arg);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		printArray(new A(), new A());
		printArray("one", "two");
		printArray(1, 2);
	}
}
class A
{
}*/

import java.util.*;
public class NewVarArgs
{
	static void f(Character... args)
	{
		System.out.print(args.getClass());
		System.out.println(" length" + args.length);
	}
	static void g(int... args)
	{
		System.out.print(args.getClass());
		System.out.println(" length" + args.length);
	}
	public static void main(String[] args)
	{
		f('a');
		f();
		g(1);
		g();
		System.out.println("int[]: " + new int[0].getClass()); // 可变参数列表不依赖于自动包装，实际上使用的就是基本类型
	}
}




