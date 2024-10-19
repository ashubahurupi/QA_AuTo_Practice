package ExceptionHandlingDemo;

import java.io.File;

public class FilehandlingDemo {
	
	public static void main (String[] args) {
		
		File file=new File(System.getProperty("user.dir")+"\\Files\\ashish.txt");
		
		boolean x=file.exists();
		
		System.out.println(x); //Boolean Result True /False
		
		System.out.println(file); // Get the actual path provided 
		
		File fileone=new File(System.getProperty("java.version"));
		System.out.println(fileone);
		
		File filetwo=new File(System.getProperty("java.home"));
		System.out.println(filetwo);
	}

}
