package edu.training.ems;
class MainClass
{
	public static void main(String a[])
	{
		Employee e = new Employee();
		//.eid=102;
		e.setEid(101);
		e.setEname("ABC");
		e.setSalary(100000);
		
		//System.out.println(e.getEid());
		//System.out.println(e.getEname());
		//System.out.println(e.getSalary());

		//System.out.println(e);
		Employee e1 = new Employee();
		e1.getDetilas(e1);
	}
}