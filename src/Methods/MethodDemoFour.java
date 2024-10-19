package Methods;

public class MethodDemoFour {
	
	public static void main(String[] args) {

		
		System.out.println("Start the main Method");
		System.out.println("Inside the main method");
		sampleone();
	    System.out.println("End the main Method");
	}

	public static void sampleone()
	{
		System.out.println("Inside Sample one mthod");
		sampleTwo();
		 sampleThree();
	}
	
	public static void sampleTwo()
	{
		System.out.println("inside sample two method");
	}
	
	public static void sampleThree()
	{
		System.out.println("Inside sample Three method");
	}
	
	
}
