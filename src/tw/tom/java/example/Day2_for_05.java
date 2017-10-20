package tw.tom.java.example;

public class Day2_for_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0;
		for(System.out.println("tom");i<10;System.out.println("----------")) 
		{
			
			System.out.println(i);
			i++;
		}
	for(int x=0;x<2;x++) {
		for(int z=2;z<=5;z++) 
		{
			for(int y=2 ; y<=9;y++) 
			{				
				System.out.print(z+"x"+y+"="+(z*y)+"\t");				
			}
			System.out.println("");

		}
		
	}
	//-------------------------------------------------------------
	for (int z=0; z<4; z++) {
		for (int y=1; y<=9; y++) {
			for (int x = 2; x<=5; x++) {
				int newx = x + z*4;
				int r = newx * y;
				System.out.print(newx + " x " + y + " = " + r + "\t");
			}
			System.out.println();
		}
		System.out.println("----");
	}

	}

}
