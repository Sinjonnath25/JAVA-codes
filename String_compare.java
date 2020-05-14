import java.util.*;
class String_compare
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first String: ");
		String s1=sc.nextLine();
		System.out.print("Enter second String: ");
		String s2=sc.nextLine();
		if(s1.compareTo(s2)<0)
		{
			System.out.println( s1+" is less than "+s2);
		}
		else if(s1.compareTo(s2)>0)
		{
			System.out.println( s1+" is greater than "+s2);
		}
		else{
			System.out.println( s1+" is same as "+s2);
		}
	}
}