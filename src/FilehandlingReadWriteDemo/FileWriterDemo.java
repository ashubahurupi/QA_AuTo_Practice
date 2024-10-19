package FilehandlingReadWriteDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		File file=new File("zen01.txt");
		
		
		if(file.exists())
		{
			boolean f=file.createNewFile();
		}
	
		
		// Write text into the file using Filewriter
		
		FileWriter filewriter=new FileWriter(file);
		filewriter.write("I am ashish Bahurupi \n AS a QA Engineer \n Learning the Java with selenium \n Test Only(Ashish)");
		filewriter.write("I am Ashu Test  \n AS a QA Analyst \n Learning the Java with selenium \n Test Only(ashu)");
		filewriter.flush();
		
		System.out.println("programm is End Here");
	}

}
