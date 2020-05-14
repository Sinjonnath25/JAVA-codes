import java.util.*;
class Batsman
{

	private int runs,innings;
	private String name;
	Batsman(){name="Unknown";runs=0;}
	Batsman(String name){this.name=name;}
	void setBatsman(int runs)
	{
		this.runs+=runs;
		innings+=1;
	}
	void putInfo()
	{
		System.out.println("Name = "+name+" Runs Scored = "+runs+" Innings played = "+innings);
	}

}

class Bowler
{
	private String name;
	private int wicket,runs,innings;
	Bowler(){name="Unknown";wicket=0;runs=0;innings=0;}
	Bowler(String name){this.name=name;}
	void setBowler(int wicket,int runs)
	{
		this.wicket+=wicket;
		this.runs+=runs;
		innings+=1;
	}
	void putInfo()
        {
                System.out.println("Name = "+name+"Wickets taken = "+wicket+" Runs Given= "+runs+" Innings played = "+innings);
        }
}

class Cricketer
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter name of the player: ");
                String name=sc.next();
		Batsman bt=new Batsman(name);
		Bowler bw=new Bowler(name);
		System.out.print("Enter 1 for Batsman and 0 for Bowler: ");
                choice=sc.nextInt();
		do{
		if(!(choice==0||choice==1))
			 System.out.println("Wrong Choice");
		else
		{
			if(choice==1)
			{
				System.out.println("Enter runs scored by the batsman: ");
				int run=sc.nextInt();
				bt.setBatsman(run);
				System.out.println(".............Details............");
                		System.out.print("Batsman: ");
                		bt.putInfo();
			}
			else
			{
				 System.out.println("Enter Wickets tacken and runs given by the bowler: ");
				 int run=sc.nextInt();
				 int wicket=sc.nextInt();
				 bw.setBowler(wicket,run); 
				 System.out.println(".............Details............");
         		       	 System.out.print("Bowler: ");
                		 bw.putInfo();

			}
		}
		}while(choice!=-1);
	}
}
