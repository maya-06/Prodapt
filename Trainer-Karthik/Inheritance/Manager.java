class Manager extends Employee
{
	private String dept;
	
	Manager(int eid,String eName,String dept)
	{
		super(eid,eName);
		this.dept = dept;	
	}

	public void setDept(String dept)
	{
		this.dept = dept;
	}
		
	public String getDept()
	{
		super.deisplay();
		deisplay();
		return dept;
	}

	public void deisplay()
	{
		System.out.println("Manager Class");
	}

}