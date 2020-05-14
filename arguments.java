class arguments{
	static void fun(int...v){
		System.out.println("No. of arguments:"+v.length);
		System.out.println("Arguments:");
		for(int x:v)
			System.out.println(" "+x);

	}
	static void fun(boolean...v){
		System.out.println("No. of boolean parameters:"+v.length);
		System.out.println("parameters:");
		for(boolean x:v)
			System.out.println(" "+x);

	}
	public static void main(String args[]){
		fun(5,10,15,20);
		fun(true,false,false);
	}
}