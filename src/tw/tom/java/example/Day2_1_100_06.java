package tw.tom.java.example;

public class Day2_1_100_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1;i<=100;i++) 
		{
		
			boolean isp =true;
			for(int x=2;x<i;x++ ) 
			{
				if(i%x==0) 
				{
					isp=false;
					break;
				}				
			}
			System.out.print(i+(isp?"*":"") +"\t");
			
			if(i%10==0) 
			{
				System.out.println();
			}
			
		}
		

	}

}
