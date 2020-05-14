import java.util.*;
import java.util.Scanner;
class Test21{
	public static void main(String args[])
	{ 
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word");
    String str=sc.next();
    int x=ispalin(str,0,str.length()-1);
    if(x!=0)
    	System.out.println(str+" is a palindrome");
    else
    	System.out.println(str+" is not a palindrome");

	}
	 static int ispalin(String a,int i,int j){
		if(i>=j)
			return 1;
		if(a.charAt(i)!=a.charAt(j))
			return 0;
		return (ispalin(a,i+1,j-1));
	}
}