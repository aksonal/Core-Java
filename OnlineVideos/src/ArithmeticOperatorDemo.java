
public class ArithmeticOperatorDemo {
	
	/* Arithmetic : +,-,*,/,%
	 * Relational
	 * Logical
	 * Bitwise << >> 
	 */
	
	public static void main(String args[])
	{
		int num1,num2;
		num1=6;
		num2=4;
	    int addition = num1 + num2;
	    int sub = num1-num2;
	    int mul = num1 * num2;
	    int div = num1 / num2; //division operaion will only give quotient value
	    //to get decimal value we'll do casting
	    double div1= (num1/num2);
	    double div2= (double)num1/num2;
	    //for remainder
	    int remainder = num1%num2;
	    
//	    System.out.println("Addition: " + addition);
//	    System.out.println("Substraction: " + sub);
//	    System.out.println("Multiplycation: " + mul);
//	    System.out.println("Division: " + div); //1
//	    System.out.println("Decimal value of division: "+div1); //1.0
//	    System.out.println("Decimal value after casting: "+div2); //1.5
//	    System.out.println("Remainder: "+remainder);
	    
	    int n=2;
	    int m=4;
	    //n+=m; //same as n = n+m
	    //n+=1; // same as n++
	    
	    //pre increment
	    m = ++n;
	    
	    System.out.println("----Pre Increment---");
	    System.out.println("Value of m= " +m);//3
	    System.out.println("Value of n= " +n);//3
	    
	    //post increment
	    m = n++;
	    
	    System.out.println("----Post Increment---");
	    System.out.println("Value of m= " +m); //2
	    System.out.println("Value of n= " +n);//3
	    
	    //System.out.println("Value of n: " +n);
	}

}
