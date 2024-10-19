package Methods;

public class MethodDemoFive {
	
	public static void main(String[] args) {
		
		
		System.out.println("Start the main method");
		wellComeNames("Ashish", "Bahurupi");
		wellcomeTwo(10,34);
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
}
