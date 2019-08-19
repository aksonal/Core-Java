
public class FirstProg 
{

	public static void main(String args[])
	{
		float val1=5.5f;
		double val2=5.5;
		float val = 6.6f; //
		int s = 5; //4 byte, 32 bits
		short smallVal = 5; //2 bytes , 16 bits , -32768 to 32767
		byte  b = 5 ; // 1 byte , 8 bits ==> -128 to 127
		
		long num= 50000000000l; // write ' l ' after number , 8 bytes
		char c= 'A';
		c = 55;
		
		System.out.println(c); // here o/p of c will be '7' instead of '55' as data type of c is char.
		// 55 is the ASCII value of '7'
		
		double value= 5;//implicit conversions i.e int to double
		System.out.println(value); //o/p: 5.0
		
		int k = (int)5.6; //type casting i.e explicit conversion
		
		
		
		
	}	
	
}
