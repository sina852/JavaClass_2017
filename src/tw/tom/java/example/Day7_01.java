package tw.tom.java.example;

public class Day7_01 {
	public static void main(String[] args) 
	{
		
		  line2 obj1 =(line2) new line1();
		  line1 obj2 =(line1)new line2();
		
		
	}
}
interface Inter1{}

class line1 {}
class line2 extends line1 implements Inter1 {}