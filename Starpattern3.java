import java.util.*;
class Starpattern3{
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int n=obj1.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
		System.out.println();
		}
	}
}