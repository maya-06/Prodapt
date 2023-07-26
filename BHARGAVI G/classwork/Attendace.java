class Attendance
{
void markattendace()
{
	System.out.println("mass bunk");
}
void markattendace(String...S)
{
	System.out.println(S.length  +"student present");
for(String name:S)
{
	System.out.println("name");
}
public static void main(String args[])
{
Attendance a=new Attendance();
a.markattendance();
a.markattendance("kavi","tamil","priya");

}
}