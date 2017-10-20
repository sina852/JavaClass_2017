package tw.tom.java.example;

public class Day3_Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a1;
		int[] a2[];
		int a3[][];
		
		a1 = new int[3][4];
		a2 = new int[3][];
		a2[0] = new int[] {1,2,3,4};
		a2[1] = new int[] {11,22};
		a2[2] = new int[] {55,66,77,88,99};
		
		System.out.println(a2.length);
		for(int i =0;i<a2.length;i++) 
		{
			for(int z=0;z<a2[i].length;z++) 
			{
				System.out.print(a2[i][z]+" ");

			}
			System.out.println();			
		}
		
		System.out.println("------------------------");
		
		for(int[] v:a2)
		{
			for(int vlaue:v) 
			{
				System.out.print(vlaue+" ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
