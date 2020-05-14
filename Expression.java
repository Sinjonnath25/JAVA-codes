import java.util.*;
class Expression
{
 public static void main(String args[])
	{int x,y,z;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value of x & y:");
	x=obj.nextInt();
	y=obj.nextInt();
	z=5*x+6*y-x*y;
	System.out.println("Output:"+z);
	}
}
	
