package tw.tom.java.example;

public class Day4_CreatObjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String();
		
		byte[]b1= {99,98,97,96,95,94,93};
		String s2 = new String(b1);
		String s3= new String(b1,2,4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
        String s4 ="abcde";
        System.out.println(s4.concat("a12"));
        Bike bike1 = new Bike();
        System.out.println(bike1);
        
        String s5 = "沒有NEW"; //no new ,has object
        System.out.println(s5.charAt(1));
        System.out.println("沒有NEW".charAt(2));
	}

}
