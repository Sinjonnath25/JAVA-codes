import java.util.*;
class Boom
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array :");
		String arr=sc.nextLine();
		String []nums=arr.split(",");
		System.out.println(sevenBoom(nums));
	}
	public static String sevenBoom(String []a)
	{
		for(String w:a)
		{
			if(w.contains("7"))
			{
				return "Boom!";
			}
		}
		return "there is no 7 in the array";
	}
}