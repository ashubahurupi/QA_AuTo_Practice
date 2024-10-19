package FilehandlingDemo;

import java.io.File;

public class fileDeletemethodDemo {
	
	
	public static void main(String[] args) {
		File file=new File("ashish.txt");
		
		boolean f=file.delete();
		if(f)
		{
			System.out.println("File is deleted successfully");
		}
		else
		{
			System.out.println("File is not deleted, Its does not exits");
		}
		
		System.out.println("Programm is end Here");
		
	}

}
