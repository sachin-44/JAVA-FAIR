import java.util.Scanner;
class Employee{
	String name;
	int age;
	int phoneNo;
	String address;
	double salary;
	
	Employee(String name,int age,int phoneNo,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.phoneNo=phoneNo;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary()
	{
		System.out.println("The salary of " + name +" is" + salary);
	}
	
	
	
}

class Officer extends Employee{
	String specialization;
	
	Officer(String name,int age,int phoneNo,String address,double salary,String specialization)
	{
		super(name,age,phoneNo,address,salary);
		this.specialization=specialization;
	}
	
    void printDetails()
	{
        System.out.println("Name: "+name+"\n"+"Age: "+age+"\n"+"Phone no.: "+phoneNo+"\n"+"Address: "+address+"\n"+"Salary: "+salary+"\n"+"Specialization: "+specialization);
	}
	
	
}

class Manager extends Employee{
	String department;
	
	Manager(String name,int age,int phoneNo,String address,double salary,String department)
	{
		super(name,age,phoneNo,address,salary);
		this.department=department;
	}
	
    void printDetails()
	{
        System.out.println("Name: "+name+"\n"+"Age: "+age+"\n"+"Phone no.: "+phoneNo+"\n"+"Address: "+address+"\n"+"Salary: "+salary+"\n"+"Department: "+department);
	}
	
	
}


class Employeedetails_48{
	public static void main(String args[]){
	    Scanner s=new Scanner(System.in);
	    String name,address,specialization,department,str;
	    int age,ph;
	    double salary;
	    System.out.println("Enter the details of the officer");
	    System.out.println("Name:");
	    name=s.nextLine();
	    System.out.println("Age:");
	    age=s.nextInt();
	    System.out.println("Phone no.:");
	    ph=s.nextInt();
	    System.out.println("Address:");
	    str=s.nextLine();
	    address=s.nextLine();
	    System.out.println("Specialization:");
	    specialization=s.nextLine();
	    System.out.println("Salary:");
	    salary=s.nextDouble();
		Officer o1=new Officer(name,age,ph,address,salary,specialization);
		
		
        System.out.println("Enter the details of the manager");
	    System.out.println("Name:");
	    str=s.nextLine();
	    name=s.nextLine();
	    System.out.println("Age:");
	    age=s.nextInt();
	    System.out.println("Phone no.:");
	    ph=s.nextInt();
	    System.out.println("Address:");
	    str=s.nextLine();
	    address=s.nextLine();
	    System.out.println("Department:");
	    department=s.nextLine();
	    System.out.println("Salary:");
	    salary=s.nextDouble();
		Manager m1=new Manager(name,age,ph,address,salary,department);
        System.out.println("Displaying the details");
        System.out.println("Officer");
        o1.printDetails();
        System.out.println("Manager");
        m1.printDetails();
	}
}
