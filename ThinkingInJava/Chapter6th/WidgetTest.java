import access.Widget;
import access.SingleTon;
public class  WidgetTest
{
	public static void main(String[] args) 
	{
		SingleTon si = SingleTon.access();
		SingleTon si2 = SingleTon.access();
		si2.SetRed(10);
		System.out.println(si.getRed());
	}
}
