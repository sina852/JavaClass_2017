package tw.tom.java.example;

public class Day2_switch_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s= 4;
		final int b=3; // final 宣告為常數
		//byte,short,int,char,String
		switch(s) 
		{
		case 4:			
			System.out.println("正確的");
			break;
	    case b:
			
			System.out.println("正確的");
			break;
	    default :  
	    	System.out.println("預設的");
			break;		
		}
		
		int month = 9;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31");
			break;
		case 4: case 6:  case 9: case 11: 
			System.out.println("30");
			break;
		case 2: 
			System.out.println("28");
			break;
		default:
			System.out.println("XX");
			break;
		}
		
		
		
	}

}
