import java.util.*;
import java.util.Scanner;
class Item{
	private int roll,sub1,sub2,total;
    private int a[];
    private void setTotal(){
        total=sub1+sub2;
    }
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
        setTotal();
    }
    public void putItem(){
    	System.out.println("Roll="+roll);
        System.out.println("Subject 1="+sub1);
        System.out.println("Subject 2="+sub2);
        System.out.println("Total Marks="+total);
    }
    public void sort(int n){
        Item temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++)
                if(a[j].total<a[j+1].total){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
        }
    }
    
}

class student22{
	public static void main(String[] args) {
		Item a[];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many students:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter roll , marks of subject1 & subject2 of Students");
        for(i=0; i<n;i++){
            a[i].roll=sc.nextInt();
            a[i].sub1=sc.nextInt();
            a[i].sub2=sc.nextInt();
        item.setItem(a[i].roll,a[i].sub1,a[i].sub2);
        item.putItem();
        }
        item.sort(n);
        System.out.println("Sorted output:");
        for(i=0; i<n;i++)
            item.putItem();
		
	}
}