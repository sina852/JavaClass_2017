package tw.tom.java.example;

public class Day5_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tom261 obj1 = new tom261();
		
		System.out.println(tom261.count);
		tom261.call();
	}

}

class tom261
{
	static int count;
	
	static void call() 
	{
		System.out.println("11111");
	}
	
  tom261()
  {
	  System.out.println("tom261()");
  }
  tom261(int a)
  {
	  System.out.println("tom261(int)");
  }
  tom261(long a)
  {
	  System.out.println("tom261(long)");
  }

  tom261(double a)
  {
	  System.out.println("tom261(double)");
  }
  tom261(float a)
  {
	  System.out.println("tom261(float)");
  }
	
}
