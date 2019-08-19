//print pattern
/*
 * --> ****
 *     ****
 *     ****
 *     ****
 */
public class NestedLoops {
	
	public static void main(String[] args)
	{
		for(int i=0;i<4;i++)
		{
			for(int j =1;j<5;j++)
			{
			//System.out.println("* ");
			System.out.print(j +" "); //println will goto nest line while print will print in tht line itself
			}
			//System.out.print("\n"); 
			//or
			System.out.println();
		}
		
	}

}
