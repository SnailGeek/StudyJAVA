import java.util.*;

public class  GeneratorTest
{
	public static void main(String[] args) 
	{
		FruitGenerator<Integer> fr = new FruitGenerator<Integer>();
		System.out.println(fr.Text());
		AppleGenerator ap = new AppleGenerator();
		System.out.println(ap.Text());
	}
}

interface Generator<T>
{
	public T Text();
}

class FruitGenerator<T> implements Generator<T>
{
	public T Text()
	{
		return null;
	}
}

class AppleGenerator implements Generator<String>
{
	public String Text()
	{
		return "hello";
	}
}