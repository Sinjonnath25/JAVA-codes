import java.util.*;
class NoMatchException
{
public static void main(String args[])
{
try
{

Scanner sc=new Scanner(System.in);

String s=sc.nextLine();

if(s.equals("India"))
{
System.out.println("Entered string is India");
}
else
{
throw new NoMatchException();
}


}
catch(NoMatchException e)
{
System.out.println("Entered String is not India");
}

finally
{
System.out.println("Completion of program");
}
}
}
