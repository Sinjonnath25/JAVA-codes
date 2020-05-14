import java.util.*;
class Interest{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal Amount:");
		float p=sc.nextFloat();
		Float pa=new Float(p);
		System.out.println("Enter the Interest Rate in Percentage:");
		float r=sc.nextFloat()/100;
		Float ra=new Float(r);
		System.out.println("Enter the number of Years:");
		int y=sc.nextInt();
		Integer ya=new Integer(y);
		float value=calculate(pa.floatValue(),ra.floatValue(),ya.intValue());
		System.out.println("Final Value of the amount:"+value);
		
	}
	static float calculate(float p,float r,int y){
		float sum=p;
		for(int i=1;i<=y;i++){
			sum=sum*(1+r);
		}
		return sum;
	}
}