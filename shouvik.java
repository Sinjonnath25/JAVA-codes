import java.util.*;
import java.lang.Math;
class Item{
	private int v[];
	private int n;
	private double l;
	private  void len()
	       {
	       	int i;
	       	double s=0;
	       	for(i=0;i<n;i++)
	       		s+=v[i]*v[i];
	       	l=Math.sqrt(s);
	       }
	/*public Item()
	{
		n=0;
		v=null;
	}
	public Item(int k)
	{
		n=k;
		v=new int[n];
		for(int i=0;i<n;i++)
		{
			v[i]=0;
		}
	}
	public Item(Item a)
	{
		n=a.n;
		v=new int[n];
		for(int i=0;i<n;i++)
		{
			v[i]=a.v[i];
		}

	}*/
	public void input()
	{    Scanner obj=new Scanner(System.in);
		System.out.println("Enter "+n+" integer values respectively :");
		for(int i=0;i<n;i++)
			v[i]=obj.nextInt();
		len();
	}
	public void output()
	{
		System.out.println("The Vector will be :");
		for(int i=0;i<n;i++)
			{
				System.out.print(v[i]+" ");
			}
			System.out.println();
	}
	public Item greater(Item a)
	{
		if(l>a.l)
		return this;
		else
		return a;
	}
}
class shouvik
{
	public static void main(String args[])
	{   Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the value of Size of first vector :");
		int n1=obj1.nextInt();
		System.out.println("Enter the value of Size of second vector :");
		int n2=obj1.nextInt();

		Item vect1=new Item(n1);
		Item vect2=new Item(n2);
		Item vect3=new Item();

		vect1.input();
		vect2.input();

		vect1.output();
		vect2.output();

		vect3=vect1.greater(vect2);
		System.out.println("The largest vector is :");
		vect3.output();
	}
}