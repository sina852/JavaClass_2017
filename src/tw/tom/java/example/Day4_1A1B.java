package tw.tom.java.example;

import javax.swing.JOptionPane;

public class Day4_1A1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String answer=	createAnswer(4);
		
		System.out.println(answer);		
	
		
		boolean iswin =false;
		for(int i =0 ;i<10 ;i++) 
		{
	     String guess= JOptionPane.showInputDialog("Input a Number");
			
	     String result =checkAB(answer,guess);
		JOptionPane.showMessageDialog(null, result);
		  if(result.equals("4A0B"))
		  {
			  iswin = true;
			  JOptionPane.showMessageDialog(null, "Winner");
			  break;
		  }
		}
		
		if(!iswin) 
		{
			JOptionPane.showMessageDialog(null, "Loser");
		}

	}
	
	static String checkAB(String a, String g) 
	{
		int A,B; A=B=0;
		
		for(int i=0; i<g.length();i++) 
		{
	       char gc= g.charAt(i);
		   if(gc==a.charAt(i)) 
		   {
			   A++;
		   }else if(a.indexOf(gc)>=0)
		   {
			  B++;
		   }
			
		}		
		
		return A+"A"+B+"B";
	}
	
	
	static String createAnswer(int d) 
	{
		int[] poker = new int[10];	// 0, 0, ... 0      //宣告52個數值陣列
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=0; i<poker.length; i++) {
			int pos = (int)(Math.random()*(poker.length-i));	// 0 - 51
			
			// swap
			int temp = poker[pos];
			poker[pos] = poker[poker.length-i-1];	// ?
			poker[poker.length-i-1] = temp;
			
		}
		String ret="";
		
		for(int i =0;i<d ;i++)
		{
			ret+=poker[i];
		}
		
		return ret;
	}
	
	
	

}
