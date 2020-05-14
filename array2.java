import java.util.*;
class array2
{
	public static void main(String []args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		for(int i=0;i<n;i++)
			{
			int temp_index=findindex(arr,i,n);
			int temp=arr[i];
			arr[i]=arr[temp_index];
			arr[temp_index]=temp;
			System.out.println();
			System.out.print("Step "+(i+1)+": ");
			for(int k=0;k<n;k++)
                        	System.out.print("\t"+arr[k]+"\t");

			}


		System.out.println("\nResultant Array:");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
	}
	public static int findindex(int arr[],int i,int n)
	{
		int temp=999,temp_index=i,x;
		for(int j=i+1;j<n;j++)
		{
			if(arr[j]<arr[i])
				continue;
			else
			{
				if(arr[j]>arr[i]&&arr[j]<temp)
				{
				temp_index=j;
				temp=arr[j];
				}
			}
		}
		return temp_index;
	}
}