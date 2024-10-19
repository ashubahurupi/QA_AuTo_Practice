package ExceptionHandlingDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		
		int a=9,b = 1,c; 
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        
        try {
        b=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
        	System.out.println("Decimal Values are not allowd, You have to enter non -Decimal values");
        }
        sc.close();
        
       
        try{
        	 c=a/b;
             System.out.println(c);
        }
        catch(ArithmeticException ae ){
        	
    	  System.out.println("Zero input is not allowed, Please enter a Positive Number");
    	  
        }
        
       
        int x=12 , y=30;
        int z=x*y;
        System.out.println(z);
        System.out.println("End of this Programm");
       
  }
}