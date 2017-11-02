package tw.tom.java.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Day8_FileOput_append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fout = 
					new FileOutputStream("./dir1/file1", true);
			fout.write("1234567\r\n".getBytes());
			fout.flush();
			fout.close();		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
