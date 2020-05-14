import java.util.*;
class NoMatchException extends Exception
{
    private String str;
   
    NoMatchException(String str1)
    {
        str=str1;
    }

    public String toString()
    {
        return "NoMatchException String is not India and string is "+str;
    }
}
class Mains
{   
       
    public static void main(String args[ ])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enrer the String:");
        String str1=sc.nextLine();
        try
        {
            if(str1.equals("India"))  {         
                System.out.println(" String is : "+str1);
                System.out.println("No Exception Occured");
            }
            else           
             throw new NoMatchException(str1);    
        }
        catch(NoMatchException e)
        {
            System.out.println("\nCaught Exception\n"+e);
        }
    }
}       