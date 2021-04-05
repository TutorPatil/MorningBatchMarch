public class SeleniumTest{

	public static void main(String[] args)
	{
		if(args[0].equals("chrome"))
		{
			System.out.println("Running the test cases using chrome...");
		}
		if(args[0].equals("firefox"))
		{
			System.out.println("Running the test cases using firefox...");
		}
	}



}