package tw.tom.java.example;

import java.io.File;

public class Day7_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		File TestDir = new File ("c:/windows");
		System.out.println(TestDir.exists());

	}

}
