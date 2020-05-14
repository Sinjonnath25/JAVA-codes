import java.util.*;
class Starpattern5{
	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.print("Enter number of Rows: ");
		int n=obj1.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i>=2 && j<=i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
		System.out.println();
		}
	}
}