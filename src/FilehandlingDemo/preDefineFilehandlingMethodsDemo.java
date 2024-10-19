package FilehandlingDemo;

import java.io.File;
import java.io.IOException;

public class preDefineFilehandlingMethodsDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("AshishTest0.txt");
		boolean b=file.createNewFile();
		if(file.exists())
		{
		System.out.println(b);
		}
		else
		{
			
		if(b)
		{
			System.out.println("File has been Created successfully");
		}
		else
		{
			System.out.println("Fil has not Created");
		}
		System.out.println("End of the Programm");
		
		}
	}

}
