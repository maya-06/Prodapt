class VarArg
{
public static void main(String args[])
{

VarArg va = new VarArg();
va.Attendance("Alia","Bhatt");
}

void Attendance()
{
System.out.println("Mass Bunk");
}

void Attendance(String...s)
{
System.out.println("Total no.of.students present: "+s.length);
for(String i:s)
{
System.out.println(i);
}
}


}