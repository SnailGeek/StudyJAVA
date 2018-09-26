import java.util.*;
public class  TankTest
{
	public static void main(String[] args) 
	{
		Tank t = new Tank(true);
		new Tank(true);
		System.gc();
	}
}

class Tank
{
	private boolean isEmpty = false;
	Tank(boolean empty)
	{
		isEmpty = empty;
	}
	void setFull()
	{
		isEmpty = false;
	}
	protected void finalize()
	{
		if(isEmpty)
			System.out.println("Tank is empty");
	}
}