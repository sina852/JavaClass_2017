package tw.tom.java.example;

public class Day6_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tom3311 obj1 = new tom3311();
		tom3311 obj1= new tom3312();
		tom3311 obj2= new tom3312();
		
		go(obj2);
	}

	static void go(tom3311 b3) 
	{
		b3.m2();
	}
}
abstract class tom3311
{
	int a;
	void m1() 
	{
		System.out.println("tom311:m1()");
	}
	abstract void m2(); //abstract 抽象方法  : 必須宣告為抽象類別
}
class tom3312 extends tom3311  //吉普車加速方法實作
{ 
	void m2() 
	{
		System.out.println("tom3312:m2()");
	}
}
class tom3313 extends tom3311 //超跑加速方法實作
{ 
	void m2() 
	{
		System.out.println("tom3312:m2()");
	}
}