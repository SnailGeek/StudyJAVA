public class  BlankFinal
{
	private final int i = 0;
	private final int j;
	private final Poppet p;
	public BlankFinal()
	{
		j = 1;
		p = new Poppet(1);
	}
	public BlankFinal(int x)
	{
		j = x;
		p =  new Poppet(x);
	}
	public String toString()
	{
		return "i: " + i + "j: " + j + p.toString();
	}
	public static void main(String[] args) 
	{
		BlankFinal b1 = new BlankFinal();
		BlankFinal b2 = new BlankFinal(47);
		System.out.println(b1);
		System.out.println(b2);
	}
}

class Poppet
{
	private int i ;
	Poppet(int ii)
	{
		i = ii;
	}
	public String toString()
	{
		return " Poppet: " + i;
	}
}
