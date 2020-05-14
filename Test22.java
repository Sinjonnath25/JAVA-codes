import java.util.*;
class Item{
    private int n;
    public Item(){n=0;}
    public Item(int a){
        n=a;
            }
    public Item(Item a){
        n=a.n;
    }
    public void setItem(int a){
        n=a;
    }
    public void putItem(){
        System.out.println("N="+n);
    }
    public void prime(int n){
        int i,flag=0;
        if(n<=1)
            System.out.println("The number is neither Prime nor non-prime");
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {  flag=1;
                break;
            }
        }
            if(flag==0)
                System.out.println(n+" is a Prime number");
            else
                System.out.println(n+" is not a Prime number");
    }
}
class Test22{
    public static void main(String[] args) {
        Item item=new Item();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        item.setItem(n);
        item.putItem();
        item.prime(n);
    }
}