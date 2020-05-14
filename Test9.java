import java.util.*;
class Test9{
	public static void main(String args[]){
		int a[]={10,20,30};
        int b[]={1,2,3};
        int c[]=new int[3];
        int i;
        for(i=0;i<c.length;i++)
        c[i]=a[i]+b[i];

    	System.out.println("1st vector:");
        for(i=0;i<a.length;i++)
        	System.out.print(" "+a[i]);
        	System.out.println();

        System.out.println("2nd vector:");
        for(i=0;i<b.length;i++)
        	System.out.print(" "+b[i]);
        	System.out.println();
        
        System.out.println("Resultant vector:");
        for(i=0;i<c.length;i++)
        	System.out.print(" "+c[i]);
        	System.out.println();

	}
}