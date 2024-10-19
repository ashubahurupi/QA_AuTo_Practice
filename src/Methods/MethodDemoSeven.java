package Methods;

public class MethodDemoSeven {
	
	public static void main(String[] args) {
		System.out.println("Start the main method");
		int h = AddtwoNumbers(6,7);
		System.out.println(h);
		System.out.println("End the Main Method");
	}

	public static void wellComeNames(String name, String lastName)    // Parameter
	{
		System.err.println("Welcome"+ " "+ name+ " " +lastName);
	}
	
	public static void wellcomeTwo(int x, int y)
	{
	
		System.out.println("Sum of two Number  "+ x +" And "+ y+  " is :"+ (x+y));
	}
	
	public static int AddtwoNumbers(int f, int g)
	{
		int sum=f+g;
		return sum;
	
	}
	
}
