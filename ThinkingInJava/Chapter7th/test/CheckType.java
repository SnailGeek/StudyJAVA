public class  CheckType
{
	public static void main(String[] args) 
	{
		StrList strList = new StrList();
		strList.add("A");
		strList.add("B");
		strList.add("C");

		System.out.println(strList);
		for(int i = 0; i < strList.size(); i++)
		{
			str = StrList.get(i);
			System.out.println(str);
		}
	}
}

class StrList
{
	private List strList = new ArrayList();

	public boolean add(String ele)
	{
		return strList.add(ele);
	}
	public String get(int index)
	{
		return strList.get(i);
	}
	public int size()
	{
		return strList.size();
	}
}
