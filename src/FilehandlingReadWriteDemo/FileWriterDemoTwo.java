package FilehandlingReadWriteDemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemoTwo {
	
	public static void main(String[] args) throws IOException {
		
		
		File file=new File("AshishOld.txt");
		
		
		
		if(file.exists())
		{
			boolean f=file.createNewFile();
			System.out.println("File has been Created Sucsesfully ");
		}
		
		FileWriter filewriter=new FileWriter(file);
		filewriter.write("I am ashish Bahurupi \n QA Engineer \n XYZ company ");
		filewriter.flush();
		System.out.println("End program Here");
		
		FileReader fr=new FileReader(file);
		int r = fr.read();
		System.out.println(r);
		
		
	}

}
