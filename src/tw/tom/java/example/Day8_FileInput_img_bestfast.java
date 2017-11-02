package tw.tom.java.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Day8_FileInput_img_bestfast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		try {
			File file = new File("./dir1/sky.jpg");
			FileInputStream fin = new FileInputStream(file);
			byte[] buf =new byte[(int)file.length()];
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream("./dir1/sky5.jpg");
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("ok");
			
			
		}catch(Exception e) {}
		System.out.println(System.currentTimeMillis()-start);
		

	}

}
