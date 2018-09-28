public class OuterPractice7 
{
	private String str;
	OuterPractice7(String s)
	{
		str = s;
	}
	private void print()
	{
		System.out.println(str);
		System.out.println(new Inner().innerStr);
	}

	private class Inner
	{
		private String innerStr;
		public void setStr(String newStr)
		{
			str = newStr;
		}
	}

	Inner makeInner()
	{
		return new Inner();
	}

	public static void main(String[] args) 
	{
		OuterPractice7 out = new OuterPractice7("OuterPractice7");
		OuterPractice7.Inner in = out.makeInner();
		out.print();
		in.setStr("Inner");
		out.print();
	}
}
