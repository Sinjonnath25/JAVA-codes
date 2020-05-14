import java.util.*;
class stack{
	final int SIZE=10;
	private int info[]=new int[SIZE];
	private int top;

	public stack(){
		top=-1;
	} 
	public void push(int item){
		if(top==SIZE-1)
			System.out.println("stack overflow");
		else
			info[++top]=item;
	}
	public void pop(){
		if(top==-1)
			System.out.println("stack underflow");
		else
			System.out.println("popped element is "+info[top--]);
	}
}
class stack22{
	public static void main(string args[]){
		stack stk=new stack();
		int i,x;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("1:push");
			System.out.println("2:pop");
			System.out.println("3:exit");
			System.out.println("\nEnter your choice:");
			i=sc.nextInt();
			switch(i){
				case 1:System.out.println("Enter an element to push");
						x=sc.nextInt();
						stk.push(x);
						break;
				case 2:stk.pop();
						break;
				case 0:System.out.println("The End");
						break;
				default:System.out.println("invalid choice");
			}
		}while(i!=0);
	}
}
