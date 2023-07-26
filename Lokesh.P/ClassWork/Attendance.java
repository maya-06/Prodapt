// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Attendance {
        void MarkAttendance(){
            System.out.println("Mass bunk");
        }
        void MarkAttendance(String...s){
            System.out.println(s.length+" Students are present in the class");
            for(String name:s){
                System.out.println(name);
            }
        }
    public static void main(String[] args) {
        Attendance m=new Attendance();
        m.MarkAttendance("Lokesh","Jerish","Arun Kumar","Poornesh","Jeeva");

        }



}

/*ouput
5 Students are present in the class
Lokesh
Jerish
Arun Kumar
Poornesh
Jeeva
*/
