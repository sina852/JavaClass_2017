package tw.tom.java.example;

public class Tom02 {

	public static void main(String[] args) {
	   byte v1 =1;
	   byte v2=v1;
	   int v3=v1+v2; //+_*?%=> char,byte,short,int=>int
       byte v4=125;
       v4++;
       v4++;
       v4++;
       byte v5=125;
       v5+=3;
       System.out.println(v4);
       System.out.println(v5);
       byte v6 =125;
       v6=(byte)(v6+3);
       System.out.println(v6);
	}

}
