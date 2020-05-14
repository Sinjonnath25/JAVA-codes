import java.util.*;
class Elastic_w
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the word:");
		String word=sc.next();
		System.out.println(elasticize(word)); 
	}
	public static String elasticize(String w)
	{
		String lnew="";
		String rnew="";
		String mnew="";
		if(w.length()%2==0)
		{
			String l=w.substring(0,w.length()/2);
			String r=w.substring(w.length()/2,w.length());
			for(int i=0;i<l.length();i++)
			{
				lnew+=new String(new char[i+1]).replace("\0",l.substring(i,i+1));
			}
			for(int i=0;i<r.length();i++)
			{
				rnew+=new String(new char[r.length()-i]).replace("\0",r.substring(i,i+1));
			}
		}
		else
		{
			String l=w.substring(0,w.length()/2);
			String m=w.substring(w.length()/2,(w.length()/2)+1);
			String r=w.substring((w.length()/2)+1,w.length());
			for(int i=0;i<l.length();i++)
			{
				lnew+=new String(new char[i+1]).replace("\0",l.substring(i,i+1));
			}

			mnew+=new String(new char[l.length()+1]).replace("\0",m.substring(0,1));

			for(int i=0;i<r.length();i++)
			{
				rnew+=new String(new char[r.length()-i]).replace("\0",r.substring(i,i+1));
			}
		}
		return lnew+mnew+rnew;
		
	}
}