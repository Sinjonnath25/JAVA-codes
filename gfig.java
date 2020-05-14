interface Figure
{
	int volume();
	void output();
}
class cube implements Figure
{
	private int a;
	public cube(){
		a=0;
	}
	public cube(int a)
	{
		this.a=a;
	}
	public cube(cube b)
	{
		a=b.a;
	}
	public void input(int a){
		this.a=a;
	}
	public void output(){
		System.out.println("Cube");
		System.out.println("length of cube="+a);
	}
	public int volume(){
		return a*a*a;
	}

}
class pp implements Figure
{
	private int a,b,c;
	public pp(){
		a=0;
		b=0;
		c=0;
	}
	public pp(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public pp(pp p)
	{
		a=p.a;
		b=p.b;
		c=p.c;
	}
	public void input(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void output(){
		System.out.println("Parallelepiped");
		System.out.println("length ="+a+"breadth="+b+"height="+c);
	}
	public int volume(){
		return a*b*c;
	}

}
class gfig{
	public static void main(String[] args) {
		cube cu=new cube(5);
		pp pu=new pp(6,5,4);
		Figure fig;
		fig=greater(cu,pu);
		System.out.println("Greater volumed fig: ");
		fig.output();
		System.out.println("Volume="+fig.volume());
	}
	static Figure greater(cube c,pp p){
		if(c.volume()>p.volume())
			return c;
		return p;
	}
}