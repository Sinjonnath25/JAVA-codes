import java.util.*;
interface Iqueue{
    void enqueue(int item);
    void  dequeue();
    void queueDisplay();
    void queueEmpty();
}
class Queue implements Iqueue{ 
    private int front, rear, capacity; 
    private int queue[]; 
  
    public Queue(int c) 
    { 
        front = rear = 0; 
        capacity = c; 
        queue = new int[capacity]; 
    } 
  
    public void enqueue(int data) 
    { 
        if (capacity==rear) { 
            System.out.println("\nQueue is full\n"); 
            return; 
        } 

        else { 
            queue[rear] = data; 
            rear++; 
        } 
        return; 
    } 
  
    public void dequeue() 
    { 
        if (front == rear) { 
            System.out.println("\nQueue is empty\n"); 
            return; 
        } 
        else { 
            System.out.println("\nNode is deleted\n");
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
   
            if (rear < capacity) 
                queue[rear] = 0; 
            rear--; 
        } 
        return; 
    } 

    public void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.println("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.println("\nQueue Elements are:");
   
        for (i = front; i < rear; i++) { 
            System.out.print(queue[i]+"   "); 
        } 
        return; 
    } 
  
    public void queueEmpty() 
    { 
        if (front==rear) { 
            System.out.println("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.println("\nFront Element is:"+queue[front]); 
        return; 
    } 
} 
  
public class mainQueue { 
  
   
    public static void main(String[] args) 
    {   

        System.out.print("Enter the size for the queue:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Iqueue q = new Queue(n);
        int c=1;
        System.out.println("QUEUE OPERATIONS");
        do{
            System.out.println("\n1: To Add");
            System.out.println("2: To Delete");
            System.out.println("3: To Display");
            System.out.println("4: To Check Front Element");
            System.out.println("0: To exit");
            System.out.print("\nEnter your choice:");
            c=sc.nextInt();
            switch(c)
            {
                case 1: System.out.print("Enter element:");
                        int e=sc.nextInt();
                        q.enqueue(e);
                        break;
                case 2: q.dequeue();
                        break;
                case 3: q.queueDisplay();
                        break;
                case 4: q.queueEmpty();
                        break;
                case 0: System.out.print("Exit.");
                        break;
                default:System.out.println("Invalid Choice: "+c);
            }
        }while(c!=0);

    }
}