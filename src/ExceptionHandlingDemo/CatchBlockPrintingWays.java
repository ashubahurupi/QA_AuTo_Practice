package ExceptionHandlingDemo;

import java.util.Scanner;

public class CatchBlockPrintingWays {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Input Value");
		int userInput=sc.nextInt();
		
		sc.close();
		
	    int b=10;
	    int c=20;
	    
	    try
	    {
	    	int d=b/userInput;
	    }
	    catch(ArithmeticException e) {
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();
	    	
	    }
	    
	    System.out.println("End of this Programm");
	    System.out.println("End of this Programm");
	    System.out.println("End of this Programm");
	    
	}

}
