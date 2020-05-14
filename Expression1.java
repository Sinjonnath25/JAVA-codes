import java.util.*;
class Expression1
{
 public static void main(String args[])
	{int x,y,z,p;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value of x,y&z :");
	x=obj.nextInt();
	y=obj.nextInt();
	z=obj.nextInt();
	p=x*x+y*y+z*z-x*y*z;
	System.out.println("Output:"+p);
	}
}
	
