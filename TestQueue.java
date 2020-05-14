import java.util.*;

interface Queue
{
	void insert(int e);
	int remove();
	boolean isEmpty();
}

class MyQueue implements Queue
{
	private int front,rear;
	private int queue[];
	MyQueue(){front=rear=-1;}
	MyQueue(int size)
	{
		queue=new int[size];
		front=rear=0;
	}
	public void insert(int element)
	{
		if(rear==queue.length)
		{
			System.out.println("Queue size exceeded. Queue size corrected.");
			int temp[]=new int[2*queue.length];
			for(int i=0;i<queue.length;i++)
				temp[i]=queue[i];
			queue=temp;
		}
		queue[rear++]=element;
	}
	public int remove()
	{
		if(front==rear)
		{
			System.out.println("Queue underflow");
			return -1;
		}
		return queue[front++];
	}
	public boolean isEmpty()
	{
		if(front==rear)
			return true;
		return false;
	}

}

class TestQueue
{
	public static void main(String []args)
	{
		System.out.print("Enter the size for the queue:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MyQueue q=new MyQueue(n);
		int c=1;
		System.out.println("*******************Queue*******************");
		do{
			System.out.println("1: To Add");
			System.out.println("2: To Delete");
			System.out.println("2: To Display");
			System.out.println("0: To exit");
			System.out.print("\nEnter your choice:");
			c=sc.nextInt();
			switch(c)
			{
				case 1: System.out.print("Enter element:");
						int e=sc.nextInt();
						q.insert(e);
						break;
				case 2:	if(!q.isEmpty())
								System.out.println("Deleted element: "+q.remove());
						else
								System.out.println("Operation Not Possible. Queue underflow.");
						break;
				case 0:	System.out.print("Exit.");
						break;
				default:System.out.println("Invalid Choice: "+c);
			}
		}while(c!=0);

	}
}