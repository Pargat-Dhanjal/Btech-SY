class Student{  
 int rollno;  
 String name;  
 String city;  
  
 Student(int rollno, String name, String city)
{  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
}
  class tostringdemo
{
 public static void main(String args[]){  
   Student s1=new Student(101,"ABC","Mumbai");  
   Student s2=new Student(102,"XYZ","New Delhi");
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}