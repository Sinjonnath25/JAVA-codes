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
    public int fact(){
        int f=1,i;
        for(i=1;i<=n;i++)
            f=f*i;
        return f;
    }
}

class fact{
    public static void main(String[] args) {
        Item item=new Item();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        item.setItem(n);
        int s=item.fact();
        System.out.println("Resultant Object");
        item.putItem();
        System.out.println("Factorial is="+s);

        
    }
}