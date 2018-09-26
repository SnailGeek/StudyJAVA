public class  FinalOverridingIllusion
{
	public static void main(String[] args) 
	{
		OverridingPrivate2  op2 = new OverridingPrivate2();
		op2.f();
		op2.g();

		//OverridingPrivate op = op2;
		WithFinals wf = op2;
	}
}

class WithFinals
{
	private final void f()
	{
		System.out.println("WithFinals.f()");
	}
	private void g()
	{
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals
{
	private final void f()
	{
		System.out.println("OverridingPrivate.f()");
	}
	private void g()
	{
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends WithFinals
{
	@Override 
	public final void f() //此时并没有覆盖父类中的方法，而是生成了一个新的方法,@Override可以避免这个情况发生
	{
		System.out.println("OverridingPrivate2.f()");
	}
	@Override
	public void g()
	{
		System.out.println("OverridingPrivate2.g()");
	}
}
