package tw.tom.java.example;

public class Day7_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day7Tang01 obj1 = new  day7Tang01();
		day7Tang01 obj2 = new  day7Tang02();
		day7Tang02 obj3 = new  day7Tang02();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		
		obj1.m1();
		obj2.m1();
		
	}
	
	

}
class day7Tang01
{
	int a=10;
	void m1() 
	{
		System.out.println(a);
	}
	
}
class day7Tang02 extends day7Tang01
{
	int a=100;
	void m1() 
	{
		System.out.println("day7Tang02"+a);
		System.out.println(super.a);
	}
}