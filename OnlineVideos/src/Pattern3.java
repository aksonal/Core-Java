
public class Pattern3 {
	
	public static void main(String[] args)
	{
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<i;j++)
			{
				int num=64+j;
				char ch = (char)num; //type casting
				
				System.out.print(ch);
			}
			System.out.println();
			
		}
		
	}

}
