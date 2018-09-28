public class  Practice5
{
	public static void main(String[] args) 
	{
		Outer outer = new Outer("outer1");
		Outer.Inner inner = outer.new Inner();
		Outer outer2 = inner.makeOuter2();
		inner.printInner();
		outer.print();
		outer2.print();
	}
}

class Outer
{
	private String str;
	public void print()
	{
		System.out.println(str);
	}
	Outer(String str)
	{
		this.str = str;
	}
	class Inner
	{
		Outer makeOuter()
		{
			return Outer.this;
		}
		Outer makeOuter2()
		{
			return new Outer("hello");
		}
		public void printInner()
		{
			System.out.println("Inner");
		}
	}
}
