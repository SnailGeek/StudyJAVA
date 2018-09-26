import fruit.Fruit;
public class FruitTest 
{
	public static void main(String[] args) 
	{
		Apple f = new Apple(5, "Green");
		System.out.println(f);
		f.change(6, "Red");
		System.out.println(f);
	}
}

class Apple extends Fruit
{
	int size;
	Apple(int s, String color)
	{
		super(color);
		size = s;
	}
	void change(int s, String c)
	{
		set(c);
		size = s;
	}
	public String toString()
	{
		return "Apple Size: " + size + super.toString();
	}
}