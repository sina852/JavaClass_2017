package tw.tom.java.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Day8_FileInput_img {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("./dir1/sky2.jpg");
		FileInputStream fin = new FileInputStream("./dir1/sky.jpg");
		
		int i;
		
		while((i=fin.read())!=-1)
		{
			fout.write(i);
		}
		
		fin.close();
		fout.flush();
		fout.close();
		System.out.println("ok");
		}catch(Exception e)
		{
			System.out.println("err");
		}
		

	}

}
