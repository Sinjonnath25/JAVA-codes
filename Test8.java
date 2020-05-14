class Item{
	private int x,y;
	public Item(){x=y-0;}
    public Item(int a,int b){
    	x=a;
    	y=b;
    }
    public Item(Item a){
    	x=a.x;
    	y=a.y;
    }
    public void setItem(int a, int b){
    	x=a;y=b;
    }
    public void putItem(){
    	System.out.println("X="+x);
    	System.out.println("Y="+y);
    }
    public Item add(Item a){
    	Item temp=new Item();
    	temp.x=x+a.x;
    	temp.y=y+a.y;
    	return temp;
    }
}

class Test8{
	public static void main(String[] args) {
		Item item1=new Item(10,20);
		Item item2=new Item(5,15);
		Item item3;
		item3=item1.add(item2);
		System.out.println("Resultant Object");
		item3.putItem();
		
	}
}