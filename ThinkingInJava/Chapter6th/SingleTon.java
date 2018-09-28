package access;
public class SingleTon 
{
	private int red;
	private SingleTon()
	{
		red = 0;
	}
	private static SingleTon instance = new SingleTon();
	public static SingleTon access()
	{
		return instance;
	}
	public void SetRed(int newRed)
	{
		red = newRed;
	}
	public int getRed()
	{
		return red;
	}
}
