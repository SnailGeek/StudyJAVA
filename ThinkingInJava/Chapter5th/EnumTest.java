public class  EnumTest
{
	public static void main(String[] args) 
	{

		for(Money m : Money.values())
		{
			switch(m)
			{
				case DOLLAR:
					System.out.println(m + ", ordinal " + m.ordinal());
					break;
				case CENT:
					System.out.println(m + ", ordinal " + m.ordinal());
					break;
				default:
					break;
			}
		}
	}
}

enum Money
{
	DOLLAR, CENT
}
