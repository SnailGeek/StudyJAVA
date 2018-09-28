import java.util.*;

public class GenericityFuctionTest 
{
	public static void main(String[] args) 
	{
		Apple apple = new Apple();

		GenerateTest<Fruit> g1 = new GenerateTest<Fruit>();
		g1.show_1(apple);

		Person person = new Person();
		g1.show_2(person);
		g1.show_2(apple);


	}
}
class Fruit
{
	public String toString()
	{
		return "Fruit";
	}
}

class Apple extends Fruit
{
	public String toString()
	{
		return "Apple";
	}
}

class Person
{
	public String toString()
	{
		return "Person";
	}
}
class GenerateTest<T>
{
	public void show_1(T t)
	{
		System.out.println(t.toString());
	}

	public <E> void show_2(E e)
	{
		System.out.println(e.toString());
	}

	public <T> void show_3(T t)
	{
		System.out.println(t.toString());
	}

}