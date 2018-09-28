package fruit;
public class Fruit 
{
	String color;
	public Fruit(String color)
	{
		this.color = color;
	}
	protected void set(String cl)
	{
		color = cl;
	}
	public String toString()
	{
		return "The Fruit's color is " + color;
	}
}
