package test1;

class AccessOhterPackDemo
{
	public static void main()
	{
		Demo d = new Demo();
		
		System.out.println(d.publicStr);
		System.out.println(d.proctedStr);
		System.out.println(d.privateStr);
		System.out.println(d.defaultStr);
	}
}