import java.util.*;
class String_sequence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first String: ");
		String s1=sc.nextLine();
		System.out.print("Enter specified sequence of char values: ");
		String s2=sc.nextLine();
		System.out.println(s1.contains(s2));
		
	}
}