package edu.training.ems;
class Employee extends Object
{
	private int eid;
	private String ename;
	private int salary;
	
	public void setEid(int id)
	{
		eid = id;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEname(String name)
	{
		ename = name;
	}

	public String getEname()
	{
		return ename;
	}


	public void setSalary(int sal)
	{
		salary = sal;
	}
	
	public int getSalary()
	{
		return salary;
	}

		public String toString()
		{
			return eid+" "+ename+" "+salary;
		}

		
		public void getDetilas(Employee e)
		{
			System.out.println(e);
		}
}