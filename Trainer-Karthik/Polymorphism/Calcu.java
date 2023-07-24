class Calcu
{
	public void add(int num)
	{
		System.out.println("The increment value of the given number is : "+(num++));
	}
	
	public void add(int n1,int n2)
	{
		System.out.println("The Sum of two integer number is : "+(n1+n2));
	}

	public void add(double n1,double n2)
	{
		System.out.println("The Sum of two double number is : "+(n1+n2));
	}

	public void add(int n1,double n2)
	{
		System.out.println("The Sum of two number is : "+(n1+n2));
	}

	public void add(double n1,int n2)
	{
		System.out.println("The Sum of two number is : "+(n1+n2));
	}

	
	public void add(String n1,String n2)
	{
		System.out.println("The Sum of two String value is : "+(n1+n2));
	}
}