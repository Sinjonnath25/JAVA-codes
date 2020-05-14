package pkg2;
import pkg1.pkg11.*;
class Test3{
	public static void main(String args[])
	{
		Alpha ref=new Alpha();
		ref.Setdata(10,20,30);
		ref.Putdata();
		System.out.println("OUTPUT:"+ref);
	}
}