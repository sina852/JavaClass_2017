package tw.tom.java.example;

public class Day3_Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a1; //good
		int a2[];
		a1 = new int [3];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		System.out.println(a1.length);
		System.out.println(a1[0]);

		for(int i =0 ; i<a1.length;i++) 
		{
			System.out.println(a1[i]);
		}
		System.out.println("-----------------------");
		//foreach
		for(int v:a1) 
		{
			System.out.println(v);
		}
		int[] a6 = new int[]{1,2,3,4};
		int[] a3 = {1,2,3,4};
		int[] a4;
		int[] a5;
		a4 = new int[] {1,2,3,4};
		//a5 = {1,2,3,4};
		
		
	}

}
