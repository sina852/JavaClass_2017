package tw.tom.java.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Day8_FileReadString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			FileReader reader = new FileReader("./dir1/file1.txt");
			int i;
			while((i=reader.read())!=-1) 
			{
				System.out.print((char)i);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
