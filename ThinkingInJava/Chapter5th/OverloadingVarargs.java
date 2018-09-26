public class  OverloadingVarargs
{
//	static void f(Character... args)
//	{
//		System.out.print("First: ");
//		for(Character c : args)
//			System.out.print(c + " ");
//		System.out.println();
//	}
//	static void f(Integer... args)
//	{
//		System.out.print("Second: ");
//		for(Integer c : args)
//			System.out.print(c + " ");
//		System.out.println();
//	}
//	static void f(Long... args)
//	{
//		System.out.println("Third");
//	}
	static void f(float i, Character... args)
	{
		System.out.println("Fourth");
	}
	static void f(Character... args)
	{
		System.out.println("Fifth");
	}
	public static void main(String[] args) 
	{
		//f('a', 'b', 'c');
//		f(1);
//		f(2, 1);
//		f(0);
//		f(0L);
		f(1, 'a');
		f('a', 'b');
	}
}
