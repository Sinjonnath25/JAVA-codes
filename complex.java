import java.util.*;
class Item{
	private float real,imag;
	public Item(){real=imag-0;}
    public Item(float r){
        real=r;
        imag=0;
    }
    public Item(float r,float m){
    	real=r;
    	imag=m;
    }
    public Item(Item a){
    	real=a.real;
    	imag=a.imag;
    }
    public void setItem(float r,float m){
    	real=r;
        imag=m;
    }
    public void putItem(){
    	System.out.println(real+"+i"+imag);
    }
    public Item add(Item a){
    	Item temp=new Item();
    	temp.real=real+a.real;
    	temp.imag=imag+a.imag;
    	return temp;
    }
}

class complex{
	public static void main(String[] args) {
		Item item1=new Item();
		Item item2=new Item();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of real and imaginary part of 1st number");
        float a=sc.nextInt();
        float b=sc.nextInt();
        item1.setItem(a,b);
        System.out.println("Enter the value of real and imaginary part of 2nd number");
        float p=sc.nextInt();
        float q=sc.nextInt();
        item2.setItem(p,q);
		Item item3;
		item3=item1.add(item2);
		System.out.println("Resultant Object");
		item3.putItem();
		
	}
}