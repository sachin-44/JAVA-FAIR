class Employee {
	String name;
	int age;
	String phone;
	String address;
	double salary;
	public Employee (String name,int age,String phone,String address,double salary) {
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
	}
	public void printsalary() {
		System.out.println("Salary of "+name+" = "+salary);
	}
}
class Officer extends Employee {
	String specialization;
	public Officer (String name,int age,String phone,String address,double salary,String specialization) {
		super(name,age,phone,address,salary);
		this.specalization=specialization;
	}
}
class Manager extends Employee {
	String department;
	public Manager (String name,int age,String phone,String address,double salary,String department) {
		super(name,age,phone,address,salary);
		this.department=department;
	}
}
class EmployeeDisplay {
	Officer off=new Officer("Naseef",21,"6238062964","Vaniyapurayil(H)",65340.0,"Software");
	Manager man=new Manager("Sachin",20,"9207375817","Parackal(H)",76540.0,"HR");
	off.printsalary();
	man.printsalary();
}
