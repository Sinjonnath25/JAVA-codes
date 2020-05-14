import java.util.*;
import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{ 
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int x=isprime(n,n/2);
    if(x!=0)
    	System.out.println(n+" is a prime");
    else
    	System.out.println(n+" is not a prime");

	}
	 static int isprime(int i,int j){
		if(i<=1){
            System.out.println("The number is neither Prime nor non-prime");
            System.exit(0);
		}
		
			if(i%j!=0)
				return(isprime(i,j-1));
			else
				return 0;
		
	}
}