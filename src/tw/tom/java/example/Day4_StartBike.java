package tw.tom.java.example;

public class Day4_StartBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();//第一台
		Bike b2 = new Bike(3);//第二台
		b1.upSpeed();
		b1.msg("第一台速度:"+String.valueOf(b1.getSpeed()));
		b1.upSpeed();        //加速
		b1.upSpeed();       //加速
		b1.upSpeed();      //加速
		b1.upSpeed();
		b1.msg("第一台速度:"+String.valueOf(b1.getSpeed()));  //印出
		b1.downSpeed();	   //減速
		b1.downSpeed();    //減速
		b1.downSpeed();    //減速
	
		b1.msg("第一台速度:"+String.valueOf(b1.getSpeed()));  //印出
		
		b2.upSpeed(2);
		b2.upSpeed(21);   //換檔加速
		b2.msg("第二台速度:"+String.valueOf(b2.getSpeed()));  //印出
		
		System.out.println("腳踏車1_顏色:"+b1.getColor());
		System.out.println("腳踏車2_顏色:"+b2.getColor());
		
		
		

	}

}
