import java.util.*;
class Member{
	String name;
	int age;
	double phone_no;
	String address;
	int salary;

	public Member(String name,int age,double phone_no,String address,int salary){
		this.name=name;
		this.age=age;
		this.phone_no=phone_no;
		this.address=address;
		this.salary=salary;
	}
	public void printSalary(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Phone Number:"+phone_no);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
	}
}


class Employee extends Member{
	String specialization;
	Employee(String name,int age,double phone_no,String address,int salary,String specialization){
		super(name,age,phone_no,address,salary);
		this.specialization=specialization;
	}
	public void printSalary(){
		System.out.println("\n\nEmployee Details:");
		super.printSalary();
		System.out.println("Specialization:"+specialization);
	}
}

class Manager extends Member{
	String department;
	Manager(String name,int age,double phone_no,String address,int salary,String department){
		super(name,age,phone_no,address,salary);
		this.department=department;
	}
	public void printSalary(){
		System.out.println("\n\nManager Details:");
		super.printSalary();
		System.out.println("Department:"+department);
	}
}



class MainTest{
	public static void main(String[] args) {

		String name,address;
		int age,salary;
		double phone_no;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name of Member: ");
		name = sc.nextLine();

        System.out.print("Enter Age of Member: ");
		age = sc.nextInt();

		System.out.print("Enter Phone Number of Member: ");
		phone_no = sc.nextDouble();

		System.out.print("Enter Salary of Member: ");
		salary= sc.nextInt();

        System.out.print("Enter Address of Member: ");
		address = sc.nextLine();



         System.out.println("Press 1: Manager\nPress 2: Employee");
         System.out.println("Enter your choice:");
         int ch = sc.nextInt();
		if(ch ==2)
		{
			System.out.print("Enter specialization :");
	                String specialization = sc.next();
			Employee e1 = new Employee(name,age,phone_no,address,salary,specialization);
			e1.printSalary();
		}
		else
		{
			System.out.print("Enter Department :");
                       String dept = sc.next();
			Manager mng = new Manager(name,age,phone_no,address,salary,dept);
			mng.printSalary();
		}

		
	}
}