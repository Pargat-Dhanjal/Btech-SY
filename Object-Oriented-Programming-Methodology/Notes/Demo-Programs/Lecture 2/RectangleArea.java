//Program to calculate area of a rectangle using two classes


class Rectangle
{
   float length;
   float breadth;
   void getdata(float a, float b)
   {
       length = a;
       breadth = b;
    }
}

class RectangleArea
{
   public static void main (String args[])
   {
      float area;
      Rectangle rect1 = new Rectangle( ); //Creates an object rect1
      boolean x = rect1 instanceof Rectangle;
      System.out.println(x);
      
      rect1.getdata(10,20); //Assigns values to length and breadth
      area = rect1.length * rect1.breadth;
      System.out.println ("Area = " + area);
    }
 } 
