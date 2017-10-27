package tw.tom.java.example;

public class Day6_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface tom001
{
   void m1();  // public abstract
   
   int m2(double a);
}

class tom002 implements tom001  
{
   public void m1() 
   {
	   
   }	   
   public int m2 (double a) 
   {
	   return 0;
   }
}
interface tom003
{
	 void m1();
}
interface tom004
{
	 void m2();
}
interface tom005 extends tom003,tom004
{
	 void m3();
}

abstract  class tom006 implements tom005
{
	public void m1() {};
	public void m2() {};

}
class tom007 extends tom006
{
	public void m3() {};

}