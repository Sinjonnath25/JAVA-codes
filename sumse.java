import java.util.*;
class Item{
    private int n;
    private float x;
    public Item(){n=0;
        x=0;}
    public Item(int a,float b){
        n=a;
        x=b;   }
    public Item(Item a){
        n=a.n;
        x=a.x;
    }
    public void setItem(int a,float b){
        n=a;
        x=b;

    }
    public void putItem(){
        System.out.println("N="+n);
        System.out.println("X="+x);
    }
    public float series(){
        float sum=1,term=1;
        int i;
        for(i=1;i<=n;i++)
            {term=term*x;
            sum=sum+term;
        }
        return sum;
    }
}

class sumse{
    public static void main(String[] args) {
        Item item=new Item();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n & x: ");
        int n=sc.nextInt();
        float x=sc.nextFloat();
        item.setItem(n,x);
        float s=item.series();
        System.out.println("Resultant Object");
        item.putItem();
        System.out.println("Series result is="+s);

        
    }
}