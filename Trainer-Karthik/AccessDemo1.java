package test;

class AccessDemo1
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