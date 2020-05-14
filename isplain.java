class Test20{
	public static void main(string args[])
	{ 
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word");
    String str=sc.next();
    int x=ispalin(str,0,str.length()-1);
    if(x!=0)
    	System.out.println(str+"is a palindrome");
    else
    	System.out.println(str+"is not a palindrome");

	}
	static int ispalin