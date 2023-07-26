import java.util.Scanner;
class VarArgSc
{
public static void main(String args[])
{

String id;
String name;
String marks;

Scanner sc = new Scanner(System.in);

id=sc.nextLine();
name=sc.nextLine();
marks=sc.nextLine();

VarArgSc vas = new VarArgSc();
vas.StuDetails(id,name,marks);

}

void StuDetails(String...s)
{
System.out.println("\n");
for(String i:s)
{
System.out.println(i);
}
}

}