package tw.tom.java.example;

public class Day5_Regxp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String a= "A123456789";
	   String msg=a.matches("^[A-Za-z][1-2][0-9]{8}$")?"OK":"xx";	   
	   TW_ID TW1 = new TW_ID(false,24);
	   
	  String msg2= TW_ID.isRight(TW1.getID())?"true":"false";
	  
	  System.out.println(msg2);
	  System.out.println(TW1.getID());
	}

}
