import java.util.*;
import java.util.regex.*;
class Elastic_word{
	public static void main(String[] args) {
		System.out.println("Enter the word:");
		Scanner obj=new Scanner(System.in);
		String word=obj.nextLine();
			String left="";
			String right="";
			String middle="";
		if(word.length()%2==0)
		{
			String l=word.substring(0,word.length()/2);
			String r=word.substring(word.length()/2,word.length());
			for(int i=0;i<l.length();i++)
			{
				left+=new String(new char[i+1]).replace("\0",l.substring(i,i+1));
			}
			for(int i=0;i<r.length();i++)
			{
				right+=new String(new char[r.length()-i]).replace("\0",r.substring(i,i+1));
			}
		}
		else
		{
			String l=word.substring(0,word.length()/2);
			String m=word.substring(word.length()/2,(word.length()/2)+1);
			String r=word.substring((word.length()/2)+1,word.length());
			for(int i=0;i<l.length();i++)
			{
				left+=new String(new char[i+1]).replace("\0",l.substring(i,i+1));
			}

			 middle+=new String(new char[l.length()+1]).replace("\0",m.substring(0,1));

			for(int i=0;i<r.length();i++)
			{
				right+=new String(new char[r.length()-i]).replace("\0",r.substring(i,i+1));
			}
		}		
		System.out.println("After Elasticity the Output:");
		System.out.print(left+middle+right);

	

	}
}