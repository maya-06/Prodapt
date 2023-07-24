class HR_Manager extends Manager
{
	String rMgrName;
	
	HR_Manager(int eid,String eName,String dept,String rMgrName)
	{
		super(eid,eName,dept);
		this.rMgrName = rMgrName;
	}
	
	public void setRMgrName(String rMgrName)
	{
		this.rMgrName = rMgrName;
	}

	public String getRMgrName()
	{
		return rMgrName;
	}
}