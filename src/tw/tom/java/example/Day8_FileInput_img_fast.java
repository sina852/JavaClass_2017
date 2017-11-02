package tw.tom.java.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Day8_FileInput_img_fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("./dir1/sky3.jpg");
		FileInputStream fin = new FileInputStream("./dir1/sky.jpg");
		
		int len;byte[] buf= new byte[4096];
		
		while((len=fin.read(buf))!=-1)
		{
			fout.write(buf,0,len);
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
