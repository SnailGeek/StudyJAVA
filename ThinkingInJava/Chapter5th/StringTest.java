import java.util.*;

public class  StringTest
{
	public static void main(String[] args) 
	{
		TestString testStr = new TestString();
		System.out.println(testStr.str);
	}
}


class TestString
{
	String str;
	TestString()
	{
		str = "hello";
	}
}