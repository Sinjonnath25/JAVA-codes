import java.util.*;
class Item{
	private int roll,sub1,sub2;
	public Item(){roll=sub1=sub2=0;}
    public Item(int r){
        roll=r;
        sub1=0;
        sub2=0;
    }
    public Item(int r,int s1,int s2){
    	roll=r;
    	sub1=s1;
        sub2=s2;
    }
    public Item(Item a){
    	roll=a.roll;
    	sub1=a.sub1;
        sub2=a.sub2;
    }
    public void setItem(int r,int s1,int s2){
    	roll=r;
        sub1=s1;
        sub2=s2;
    }
    public void putItem(){
    	System.out.println("Roll="+roll);
        System.out.println("Subject 1="+sub1);
        System.out.println("Subject 2="+sub2);
    }
    public int total(){
    	int t;
        t=sub1+sub2;
        return t;
    }
}

class student{
	public static void main(String[] args) {
		Item item1=new Item();
		Item item2=new Item();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll , marks of subject1 & subject2 of 1st Student");
        int r=sc.nextInt();
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        item1.setItem(r,s1,s2);
        System.out.println("Enter roll , marks of subject1 & subject2 of 2nd Student");
        int rr=sc.nextInt();
        int ss1=sc.nextInt();
        int ss2=sc.nextInt();
        item2.setItem(rr,ss1,ss2);
		int t1=item1.total();
        int t2=item2.total();
        System.out.println("Records of 1st Student");
        item1.putItem();
        System.out.println("Total Marks of 1st student="+t1);
        System.out.println("Records of 2nd Student");
        item2.putItem();
        System.out.println("Total Marks of 2nd student="+t2);
		
		
	}
}