import java.util.*;
class Sum
{ public static void main(String args[])
	{int i,n,s=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	n=obj.nextInt();
	for(i=1;i<=n;i++)
	s=s+i;
	System.out.println("Result of Sum:"+s);
	}
}