package tw.tom.java.example;

public class Day6_abstractClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		tom111 obj1 = new tom222();
		obj1.m1();
	}

}
abstract class tom111
{
	void m1() 
	{
		System.out.println("tom1:m1()");
	}
}
class tom222 extends tom111
{
	void m2() 
	{
		System.out.println("tom2:m2()");
	}
}