package tw.tom.java.example;

public class Day2_bool_01 {
	public static void main(String[] Tom) 
	{
	 Boolean State = true;
	   if(State) 
	   {
		   System.out.println("OK");
	   }else 
	   {
		   System.out.println("NO");
	   }
	   double temp =Math.random();
	   
	   int score=(int)(temp*101);// 0-100
	   
	   System.out.println(score);
	   if(score>=90) 
	   {
		   System.out.println("A");
	   }else if (score>=80)
	   {
		   System.out.println("B");
	   }else if (score>=60)
	   {
		   System.out.println("D");
	   }else 
	   {
		   System.out.println("E");  
	   }
	   
	}
}
