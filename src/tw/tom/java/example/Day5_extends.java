package tw.tom.java.example;

public class Day5_extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Tom2 t = new Tom2(); //雖Tom2沒寫 但能繼承Tom1類別
      t.m1();
      t.m2();
      System.out.println(t.a);
	}

}
class Tom1
{
	int a =10;
	 void m1() 
	{
		System.out.println("Tom1:m1()");
	}
}
class Tom2 extends Tom1
{
	@Override
		void m1() {
			// TODO Auto-generated method stub
			super.m1();                         //先做爸爸的,在做自己的
			System.out.println("Tom2:m1()");
		}
	
//	@Override
//	void m1() {
//		System.out.println("Tom2:m1()");
//	}
	void m2() 
	{
		System.out.println("Tom2:m2()");
	}
}