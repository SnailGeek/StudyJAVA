import java.util.*;

public class  ListErr
{
	public static void main(String[] args) 
	{
		List strList = new ArrayList();
		strList.add("A");
		strList.add("B");
		strList.add("C");

		//strList.add(5);

		for(int i = 0; i < strList.size(); i++)
		{
			String str = (String)strList.get(i);
			System.out.println(str);
		}
	}
}

