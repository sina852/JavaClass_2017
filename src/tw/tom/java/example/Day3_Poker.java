package tw.tom.java.example;

public class Day3_Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//洗牌=>poker[]
		long start = System.currentTimeMillis();
		int [] poker= new int[52];
		for(int i=0;i<poker.length;i++) 
		{
			int temp=(int)(Math.random()*52);
			//檢查機制
			boolean isR=false;
			for(int j=0;j<i;j++) 
			{
				if(temp==poker[j]) 
				{
					isR=true;
					break;
				}				
			}
			if(isR) 
			{
				i--;
				continue; //以下不做
			}else 
			{	
				poker[i]=temp;
				System.out.println(poker[i]);
			}

		}
		System.out.println("===============");
		System.out.println(System.currentTimeMillis() - start);
		
		
		

	}

}
