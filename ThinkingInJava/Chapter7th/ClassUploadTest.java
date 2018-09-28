public class ClassUploadTest 
{
	public static void main(String[] args) 
	{
		//TestUpload t = new TestUpload();
		//TestUpload t2 = new TestUpload();
		//TestUpload.printInit("Hello ,world");
	}
}

class TestUpload
{
	private static int test = printInit("TestUploadInitialized");
	static int printInit(String s)
	{
		System.out.println(s);
		return 88;
	}
}