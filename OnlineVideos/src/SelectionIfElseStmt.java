
public class SelectionIfElseStmt {
	
	public static void main(String args[])
	{
		int n =11;
		
//		if(n % 2==0)
//		{
//			System.out.println("Even No.");
//		}
//		if(n % 2 != 0)
//		{
//		    System.out.println("Odd Num");
//		}
		
		//OR
		
//		if(n % 2==0)
//		{
//			System.out.println("Even No.");
//		}
//		else
//		{
//		    System.out.println("Odd Num");
//		}
		
		
		//Or
		
//		int m = 0;
//		
//		if(m==0)
//		{
//			System.out.println("Nothing, It's a Zero"); // here this condition will always be true
//			
//		}
//		
//		else if(m%2 ==0)
//		{
//			System.out.println("Even Number"); 
//			
//		}
//		
//		else
//			System.out.println("Odd");
//		
		
		//Ternary operator
		
		//condition?exp1:exp2
		//if the condition is true we get exp1 and if its false we get exp2
		
		int i=5;
		int j=0;
		
//		if(i>6)
//			j=1;
//		else
//			j=2;
//		System.out.println("J= "+j);
		
		//In ternary
		
		j=i>6?1:2;
		//System.out.println("J="+j);
		
		
		//SWITCH
		
		char a='A';
		int num=10;
		switch(a)
		{
		case 'A': System.out.println("Zero");
		        break;
		case 1: System.out.println("One");
		        break;
		case 2: System.out.println("Two");
		        break;
		case 3: System.out.println("Three");
		        break;
		case 4: System.out.println("Four");
		        break;
		case 5: System.out.println("Five");
		        break;
		case 6: System.out.println("Six");
		        break;        
		case 7: System.out.println("Seven");
		        break;
		case 8: System.out.println("Eight");
		        break;
		case 9: System.out.println("Nine");
		        break;
		default: System.out.println("No such Number");
		
		
		}
		}
		
		
	}


