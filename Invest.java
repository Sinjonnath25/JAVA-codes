import java.util.*;
class Invest{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Investment Amount:");
		float p=sc.nextFloat();
		System.out.println("Enter the Interest Rate in Percentage:");
		float r=sc.nextFloat()/(100*12);
		System.out.println("Enter the number of Years:");
		int y=sc.nextInt();
		System.out.println("Years	Future Value");
		float sum=p;
		for(int i=1;i<=y;i++){
			for (int j=1;j<=12;j++) {
				sum=sum*(1+r);
			}
			System.out.println(i+"\t"+sum);
		}
	}
}