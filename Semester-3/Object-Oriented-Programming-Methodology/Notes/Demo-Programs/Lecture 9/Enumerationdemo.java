import java.util.Vector;
import java.util.Enumeration;
class Enumerationdemo {

   public static void main(String args[]) {
      Enumeration days;
      Vector<String> dayNames = new Vector<>();
      
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      days = dayNames.elements();
      
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
   }
}