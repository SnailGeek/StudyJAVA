public class Outer
{
	private String str;
	Outer(String str)
	{
		this.str = str;
	}
	Inner makeInnerObj()
	{
		return new Inner();
	}
	private class Inner
	{
		public String toString()
		{
			return str;
		}
	}

	public static void main(String[] args)
	{
		Outer out = new Outer("test");
		Inner in = out.makeInnerObj();
		System.out.println(in.toString());
	}
}