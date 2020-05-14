import java.util.*;
class Employee
{
	String name;
	int age;
	String address;
	Employee(String name,int age,String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String toString()
	{
		return("Name: "+name+"\n Age: "+age+"Address: "+address+"\n");
	}
}
class Manager extends Employee
{
	String dept;
	int salary;
	Manager(String name,int age,String address,String dept,int salary)
	{
		super(name,age,address);
		this.dept = dept;
		this.salary = salary;
	}
	public String toString()
        {
                return(super.toString()+"Department: "+dept+"\n");
        }
}
class Worker extends Employee
{
        int noWorking;
	int dailyWage;
	int totalSal;
	Worker(String name,int age,String address,int noWorking,int dailyWage)
	{
		super(name,age,address);
		this.noWorking = noWorking;
		this.dailyWage = dailyWage;
	}
	public void getSalary()
	{
		totalSal = noWorking*dailyWage;
	}
	public String toString()
        {
                return(super.toString()+"No of Working Days: "+noWorking+"\nDailyWage: "+dailyWage+"Total Salary: "+totalSal+"\n");
        }
}

class Inheritance1
{
	public static void main(String[] args)
	{
		String name,address,dept;
		int noWorking,dailyWage,age,ch,salary;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name of Employee: ");
		name = sc.next();

                System.out.print("Enter Age of Employee: ");
		age = sc.nextInt();

                System.out.print("Enter Address of Employee: ");
		address = sc.next();

                System.out.print("Press 1: Manager\nPress 2: Worker");
               ch = sc.nextInt();
		if(ch ==2)
		{
			System.out.print("Enter No. of Working days :");
	                noWorking = sc.nextInt();
			System.out.print("Enter daily Wage :");
                        dailyWage = sc.nextInt();
			Worker wrk = new Worker(name,age,address,noWorking,dailyWage);
			wrk.getSalary();
			System.out.print(wrk);
		}
		else
		{
			System.out.print("Enter Dept :");
                        dept = sc.next();
                        System.out.print("Enter Salary :");
                        salary = sc.nextInt();
			Manager mng = new Manager(name,age,address,dept,salary);
			System.out.println(mng);
		}
	}
}