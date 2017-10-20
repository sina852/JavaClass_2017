package tw.tom.java.example;

import java.util.Arrays;

public class Day3_Porker3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 洗牌 => poker[]
				long start = System.currentTimeMillis();
				int[] poker = new int[52];	// 0, 0, ... 0
				for (int i=0; i<poker.length; i++) poker[i] = i;
				
				for (int i=0; i<poker.length; i++) {
					int pos = (int)(Math.random()*(poker.length-i));	// 0 - 5
					
					// swap
					int temp = poker[pos];
					poker[pos] = poker[poker.length-i-1];	// ?
					poker[poker.length-i-1] = temp;
					
				}
				
				for (int v : poker) {
					System.out.println(v);
				}
				System.out.println("-共花秒數---");
				System.out.println(System.currentTimeMillis() - start);
				
				// 發牌 => players[4][13]
				int [][] players = new int [4][13];
				for(int i =0;i<poker.length;i++) 
				{
					players[i%4][i/4]=poker[i];
				}
				
				String[] suits= {"黑桃♠","紅心♥","方塊♦","梅花♣"};
				String[] values= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
				
				System.out.println("--發牌--");		
				// 攤牌 => for-each => 理牌
				for(int[] player :players) 
				{
					Arrays.sort(player);
					for(int cart :player) 
					{
						System.out.print(suits[cart/13]+values[cart%13]+" ");
					}
					
					System.out.println();
				}
				
				
				
				
		

	}

}
