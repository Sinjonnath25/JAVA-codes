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
    public int prime(int i,int j){
        if(j==1)
            return 1;
        else{
        if(i%j==0)
                return 0;
        else
        return (prime(i,j-1));
       }
      
    }
}
class Testprime{
    public static void main(String[] args) {
        Item item=new Item();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        item.setItem(n);
        item.putItem();
        if(item.prime(n,n/2)!=0)
                System.out.println(n+" is a Prime number");
            else
                System.out.println(n+" is not a Prime number");
    }
}