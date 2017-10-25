package tw.tom.java.example;

public class TW_ID {
	private String id;
	private static String letters ="ABCDEFGHJKLMNPQRSTUVXYWZIO"; 
	
	public TW_ID() 
	{
		this((int)(Math.random()*2)==0);
	}
	public TW_ID(String id) 
	{
		this.id=id;
	}
	public TW_ID(boolean isMale) 
	{
		this(isMale, (int)(Math.random()*26));
	}
	public TW_ID(int area) 
	{
		this((int)(Math.random()*2)==0,area);
	}
	public TW_ID(boolean isMale,int area) 
	{
		id=letters.substring(area, area+1);
		id+=isMale?"1":"2";
		for(int i=0;i<7;i++) 
		{
			id+=(int)(Math.random()*10);
		}
		
		for(int i=0;i<10;i++) 
		{
			if(isRight(id+i)) 
			{
				id=id+i;
				break;
			}
		}
				
	}
	
	
	
	
	public String getID() 
	{
		return id;
	}
    public boolean isMale() 
    {
    	
    	return true ;
    }
    public String getArea() 
    {
    	return "A";
    }
    
    public static boolean isRight(String id)
    {
    	boolean _isRight=false;
    	_isRight =id.matches("^[A-Za-z][1-2][0-9]{8}$")?true:false;	 
    	//5.檢查碼
    	String letters="ABCDEFGHJKLMNPQRSTUVXYWZIO";
    	int n12 = letters.indexOf(id.charAt(0))+10;
    	int n1 =n12/10;
    	int n2 =n12%10;
    	int n3 =Integer.parseInt(id.substring(1,2));
    	int n4 =Integer.parseInt(id.substring(2,3));
    	int n5 =Integer.parseInt(id.substring(3,4));
    	int n6 =Integer.parseInt(id.substring(4,5));
    	int n7 =Integer.parseInt(id.substring(5,6));
    	int n8 =Integer.parseInt(id.substring(6,7));
    	int n9 =Integer.parseInt(id.substring(7,8));
    	int n10 =Integer.parseInt(id.substring(8,9));
    	int n11 =Integer.parseInt(id.substring(9,10));
    	int sum=n1*1 +n2*9+n3*8+n4*7+n5*6+
    			n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
    	_isRight = sum % 10 == 0;
    	return _isRight;
    }
    
    
    
}
