class MainClass
{
	public static void main(String a[])
	{
		/*
		Employee e1 = new Employee(101,"Siva");
		e1.setEid(104);
		e1.setEname("XYZ");
		
		Employee e2 = new Employee(102,"Yaazhini");

		
		
		Employee e3 = new Employee(103,"Sivaazhini");

		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		*/

		/*
		Manager m = new Manager(118,"Karthi","SME");

		System.out.println(m.getEid());
		System.out.println(m.getEname());
		System.out.println(m.getDept());
		*/

		HR_Manager hrMgr = new HR_Manager(118,"Karthi","SME","Sivaazhin");
		System.out.println(hrMgr.getEid());
		System.out.println(hrMgr.getEname());
		System.out.println(hrMgr.getDept());
		System.out.println(hrMgr.getRMgrName());	
			

	}
}