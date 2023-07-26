class Attendance
{
public void markAttendance()
{
System.out.println("Mass Bunk");
}
public void markAttendance(String...s)
{
System.out.println(s.length + " Student present");
for(String name:s)
{
System.out.println(name);
}
}
public static void main(String a[])
{
Attendance c=new Attendance();
c.markAttendance();
c.markAttendance("mohana","gaya");
c.markAttendance("Yamini","Surya","Yugan");
}
}

