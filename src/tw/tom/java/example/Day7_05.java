package tw.tom.java.example;

public class Day7_05 {

	c0001 obj1= new c0001();
	int a=10;
	void m1() 
	{
		obj1.m2(a);
	}
	class c0002
	{
		void m3() 
		{
			System.out.println(a);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class c0001
{
	void m2(int b) 
	{
		System.out.println("11");
	}
}