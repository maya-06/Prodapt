class Student
{
	int sid=0;
	String sName=null;
	int marks=0;
	

	Student()
	{
		System.out.println(sid+" "+sName+" "+marks);
	}

	Student(int sid)
	{
		new Student();
		System.out.println(sid+" "+sName+" "+marks);
	}

	Student(int sid,String sName)
	{
		new Student(101);
		System.out.println(sid+" "+sName+" "+marks);
	}

	Student(int sid,String sName,int marks)
	{
		new Student(102,"ABC");
		System.out.println(sid+" "+sName+" "+marks);
	}

}
		