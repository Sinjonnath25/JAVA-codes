import java.util.*;
class MyException extends Exception
{
    private String str;
   
    public MyException()
    {
        str="Demo";
    }
    public MyException(String s)
    {
        str=s;
    }

    public String toString()
    {
        return "["+str+"]";
    }
}
class Test52{
    public static void cal(int x) throws MyException{
        int t=x+200;
        if(t>300){
            System.out.println("OUTPUT:"+t);
            System.out.println("NO Exception as the number is greater than 300");

        }
        else{
            System.out.println("OUTPUT:"+t);
            throw new MyException();
        }
    }
 public static void main(String args[ ])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enrer the Number:");
        int n=sc.nextInt();
        try
        {
            cal(n);  
        }
        catch(MyException e)
        {
            System.out.println("\nException\n"+e);
            System.out.println("\nNumber is less than 300\n");
        }
        finally{
            System.out.println("\nProgram Finished\n");
        }
    }
}       