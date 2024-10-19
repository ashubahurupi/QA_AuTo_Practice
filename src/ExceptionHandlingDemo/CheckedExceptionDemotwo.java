package ExceptionHandlingDemo;

import java.io.File;

public class CheckedExceptionDemotwo {
	
	
	public static void main(String[] args) {
		
		File file=new File("C:\\LMS Project\\SeleniumWebdriverPractice\\ashish.txt");
		
		boolean f=file.exists();
		
		if(f)
		{
			System.out.println("File is Exit the Given Path");
		}
		else
		{
			System.out.println("File not Exit in Given path");
		}
		
		System.out.println(f);
		
		File newFile=new File("C:\\LMS Project\\SeleniumWebdriverPractice\\Bahurupi.txt");
		
		boolean g=newFile.exists();
		System.out.println(g);
		
		if(g)
		{
			System.out.println("File is Exit the Given Path");
		}
		else
		{
			System.out.println("File not Exit in Given path");
		}
		
	}

}
