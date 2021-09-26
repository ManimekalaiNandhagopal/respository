// Factorial of largest Number
import java.util.Scanner;
class Factorial
{
	public static void main(String arg[])
		{
		long input,fact=1;
	
	    Scanner AF=new Scanner(System.in);
 
	    System.out.println("enter number");
	   
        input=AF.nextLong();
 
	    for(int i=1;i<=input;i++)
	    {
	
	    fact=fact*i;
 
 	    }
 
  	    System.out.println("fact="+fact);
 
	}
 
}