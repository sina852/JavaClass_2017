package tw.tom.java.example;

import java.io.*;

public class Day8_FileInput {

	public static void main(String[] args) 
	{
		try 
		{
		FileInputStream fin = new FileInputStream("./dir1/file1.txt");
		int v1;byte[]buf=new byte[3];
		while((v1=fin.read(buf))!=-1) 
		{
			System.out.print(new String(buf));
		}
		
		
		fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
		
	}
}
