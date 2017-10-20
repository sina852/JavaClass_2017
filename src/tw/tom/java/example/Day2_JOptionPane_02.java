package tw.tom.java.example;

import javax.swing.JOptionPane;

public class Day2_JOptionPane_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String yearString =JOptionPane.showInputDialog("Input Year");
	int year =Integer.parseInt(yearString);
	   
	 if(year%4==0) 
	 {
		 if(year%100==0) 
		 {
			 if(year%400==0) 
			 {
				 //29
				System.out.println("29");
			 }else 
			 {
				 //28
				 System.out.println("28");
			 }
		 }else 
		 {
			 //29
			 System.out.println("29");
		 }
		 
	 }else 
	 {
		 //28
		 System.out.println("28");
	 }
	}

}
