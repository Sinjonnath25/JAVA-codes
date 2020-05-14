import java.util.*;
class pattern1{
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter number of Rows: ");
		int n=obj1.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print("* ");
		System.out.println();
		}
	}
}