package FilehandlingDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandlingDemo {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
	
	File f1= new File(System.getProperty("user.dir")+"\\Files\\ashish.txt");
    
	FileReader fr=new FileReader(f1);
	
	// BufferReader br=new BufferReader(fr);
}
}