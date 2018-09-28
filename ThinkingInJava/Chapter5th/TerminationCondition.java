import java.util.*;
class Book 
{
	boolean checkedout = false;
	Book(boolean checkout)
	{
		checkout = checkedout;
	}
	void checkIn()
	{
		checkedout = false;
	}
	protected void finalize()
	{
		if(checkedout)
			System.out.println("Error: checked out");
	}
}

public class TerminationCondition
{
	public static void main(String[] args)
	{
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}
