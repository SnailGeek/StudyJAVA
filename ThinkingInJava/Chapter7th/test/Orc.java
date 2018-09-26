public class  Orc extends Villain
{
	private int orcNumber;
	public Orc(String name, int orcNumebr)
	{
		super(name);
		this.orcNumber = orcNumber;
	}
	public void change(String name, int orcNumber)
	{
		set(name);
		this.orcNumber = orcNumber;
	}
	public String toString()
	{
		return "Orc" + orcNumber + " : " + super.toString();
	}
	public static void main(String[] args) 
	{
		Orc orc = new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}

class Villain
{
	private String name;
	public Villain(String name)
	{
		this.name = name;
	}
	protected void set(String nm) 
	{
		name = nm;
	}
	public String toString()
	{
		return "I'm a Villain and my name is " + name;
	}
}
