package tw.tom.java.example;

public class Bike {
	
   
	private double speed; //私有範圍
	private int color;//0
	Bike() //建構式
	{
		System.out.println("ok");
		color=1;
	}
	Bike(int setColor) //建構式
	{
		System.out.println("ok");
		color=setColor;
	}
	
	void upSpeed()
	{
		speed=speed<1?1:speed*1.2;
	};
	void upSpeed(int gear)
	{
		speed=speed<1?1:speed*(1.2+gear);
	};
	void downSpeed()
	{
		speed=speed<1?0:speed*0.7;
	};
	
	double getSpeed() 
	{
		return speed;
	}
	int getColor() 
	{
		return color;
	}
	
	public void msg (String S) 
	{
		
		System.out.println(S);
	}


}
