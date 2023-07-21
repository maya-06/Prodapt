package edu.training;
class Employee1
{
	int eid;
	String eName;
	String dest;
	long salary;
	
	Employee(int id,String name, String des,long sal)
	{
		eid=id;
		eName=name;
		dest=des;
		salary=sal;
	}
	
	void setEmployeeDetails(int id,String name, String des,long sal)
	{
		eid=id;
		eName=name;
		dest=des;
		salary=sal;
	}

	void displayEmployeeDetails()
	{
		System.out.println("Employee ID : "+eid);
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee Des : "+dest);
		System.out.println("Employee Salary : "+salary);
	}
	
	public static void main(String a[])
	{
		Employee e = new Employee(105,"AAA","MGR",2000l);
		e.setEmployeeDetails(101,"ABC","Managher",10000l);
		e.displayEmployeeDetails();

		Employee e1 = new Employee(106,"BBB","HR",3000l);
		e1.setEmployeeDetails(102,"XYZ","HR",50000l);
		System.out.println("--------------------------");
		e1.displayEmployeeDetails();

		e1 = new Employee(107,"CCC","DEV",3000l);
		e1.setEmployeeDetails(103,"MNV","Dev",200000l);
		System.out.println("--------------------------");
		e1.displayEmployeeDetails();
	}
}
	
