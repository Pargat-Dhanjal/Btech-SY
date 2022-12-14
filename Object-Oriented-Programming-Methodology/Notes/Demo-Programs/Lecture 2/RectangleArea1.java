//Program to calculate area of a rectangle using two classes
import java.util.*;

class Rectangle1
{
   double length;
   double breadth;
   void getdata()
   {
      
        Scanner sc = new Scanner(System.in); //Creating an object of Scanner class
        System.out.println("Enter length: "); //printf statement
        length = sc.nextDouble(); //scanf statement
        
        System.out.println("Enter breadth: ");
        breadth = sc.nextDouble();
    }
}

class RectangleArea1
{
   public static void main (String args[])
   {
      double area;
      Rectangle1 rect1 = new Rectangle1( ); //Creates an object rect1
      rect1.getdata(); //Assigns values to length and breadth
      area = rect1.length * rect1.breadth;
      System.out.println ("Area = " + area);
    }
 } 
