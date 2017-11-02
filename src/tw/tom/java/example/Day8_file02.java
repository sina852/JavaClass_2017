 package tw.tom.java.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day8_file02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File file = new File("./dir1/file1.txt");
			try {
		    FileOutputStream fout = new FileOutputStream(file);
		    String data = "Hello! World\r\nTOM Welcome!";
		    String data2 = "\r\nJAVA OutPut OK!中文";
		    fout.write(data.getBytes());
		    fout.write(data2.getBytes());
		    fout.flush();
		    fout.close();
		    System.out.println("ok");
			}
			catch(FileNotFoundException fe) {System.out.println("not found");}
			catch(IOException fe) {System.out.println("IOException");}
		 

	}

}
