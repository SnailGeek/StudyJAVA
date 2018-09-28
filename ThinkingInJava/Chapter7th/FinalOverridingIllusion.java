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
	public final void f() //��ʱ��û�и��Ǹ����еķ���������������һ���µķ���,@Override���Ա�������������
	{
		System.out.println("OverridingPrivate2.f()");
	}
	@Override
	public void g()
	{
		System.out.println("OverridingPrivate2.g()");
	}
}
