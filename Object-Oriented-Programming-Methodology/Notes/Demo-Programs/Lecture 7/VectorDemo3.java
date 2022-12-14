
import java.util.*;

class Student
{
   int rollno;
   String name;
   String schoolcode;

   Student (int rollno, String name, String schoolcode)
   {
     this.rollno = rollno;
     this.name = name;
     this.schoolcode = schoolcode;
   }
   
   void display()
   {
      System.out.println("RollNo: " + this.rollno + "\nName: " + this.name + "\nSchool Code: " + this.schoolcode);
    }
 }
 
class VectorDemo3
{
   public static void main (String [] args)   {
      Vector  <Student> v = new Vector <Student> (5);
  
       v.addElement(new Student(25,"Pragya Gupta","KJSCE"));
       v.addElement(new Student(26,"ABC","KJSCE")); 
       v.addElement(new Student(27,"XYZ","KJSCE"));
      v.add(new Student(28,"PQR","KJSCE"));
       for(Object O: v)//for-each loop
      { System.out.println();
        
       ((Student)O).display();}
                 
    }
 }
 