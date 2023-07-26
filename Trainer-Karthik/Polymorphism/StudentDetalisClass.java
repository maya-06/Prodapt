import java.util.Scanner;
class StudentDetalisClass
{
	String id;
	String name;
	String mark;
	
	StudentDetalisClass(){}

	StudentDetalisClass(String id,String name,String mark)
	{
		this.id=id;
		this.name=name;
		this.mark = mark;
	}
	
	public String toString()
	{
		return id+" \t"+name+" \t"+mark;
	}

	public  void studentDetails(StudentDetalisClass... details)
	{
		for(StudentDetalisClass d:details)
		{
    			System.out.println(d);
		}
	}	
	
	public static void main(String a[])
	{
		
		Scanner s = new Scanner(System.in);
		StudentDetalisClass studentDetalis[] = new StudentDetalisClass[5];
		for(int i=0;i<3;i++)
		{	
			System.out.println("Enter the Student ID");
			String sid = s.next();
			System.out.println("Enter the Student Name");
			String sName = s.next();
			System.out.println("Enter the Student Marks");
			String marks = s.next();

			StudentDetalisClass student = new StudentDetalisClass(sid,sName,marks);
			
			studentDetalis[i] = student;
		}
		
		System.out.println(studentDetalis);
		
		StudentDetalisClass studentarr = new StudentDetalisClass();
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetalis[0]);
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetalis[0],studentDetalis[1]);
		System.out.println("----------------------------------------------");
		studentarr.studentDetails(studentDetalis);
		
	}
	
	
}

















