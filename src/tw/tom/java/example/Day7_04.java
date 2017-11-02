package tw.tom.java.example;

public class Day7_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(c01.b);
		//c01.m2();
		
		c01 obj = new c01();  //只要類別存宣告 他會先將整個類別載入記憶體當中 針對static
		c01 obj2 = new c01();
		c01 obj3 = new c01();
		obj.m1();
		System.out.println("---------------------");
		c003 objc3 = new c003();
		
	}
	
	

}
class c01
{
	int a =10;
	static int b= 100;
	{
		System.out.println("{}");
	}
	static
	{
		System.out.println("static{}");
	}
	
	c01()
	{
		System.out.println("c01()");
	}
	void m1() 
	{
		System.out.println("m1() ");
	}
	static void m2() 
	{
		System.out.println("m2()");
	}
	{
		System.out.println("程式區塊");
	}
}
class c001
{
	static {System.out.println("c001:static{}");}
	{System.out.println("c001:{}");}
	c001(){System.out.println("c001建構式");}
	}
class c002 extends c001
{
	static {System.out.println("c002:static{}");}
	{System.out.println("c002:{}");}
	c002(){System.out.println("c002建構式");}
	}

class c003 extends c002
{
	static {System.out.println("c003:static{}");}
	{System.out.println("c003:{}");}
	c003(){System.out.println("c003建構式");}
	}

