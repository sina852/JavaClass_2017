package tw.tom.java.example;

public class Day7_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int a =10,b=0;
       int [] c= {1,2,3,4};
    try {
       System.out.println(a/b);
       }
    catch (Exception e) {
    	ArithmeticException s =(ArithmeticException) e;
    	System.out.println(s);
    	System.out.println(e);
		// TODO: handle exception
    	}
	System.out.println("ok");
	Bird b1 = new Bird();
		try {b1.setLeg(20);}
	catch(Exception e) {}
	  System.out.println("敲貴巡街");
	}}

	
	
		
	
	
	
	


class Bird
{
	private int leg;
	void setLeg(int n) throws Exception 
	{
		if(n>0&&n<=2) 
		{
			leg=n;
		}
		else 
		{
			throw new Exception();
		}			
	}

}
class BirdV2 extends Bird
{
	@Override 
	void setLeg(int n) throws Exception 
	{
		
		
	}
}
