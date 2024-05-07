class Rectangle
{
   int length;
   int breadth;
   double area;

Rectangle(int length,int breadth)
{
   this.length = length;
   this.breadth = breadth;
 }

void calc_area()//instance method
{
  area = length * breadth;
  System.out.println("Area is:"+area);
}

}

class Rectarea
{
   public static void main(String args[])
  {
    Rectangle R1 = new Rectangle(6,7);
    Rectangle R2 = new Rectangle(3,4);
    R1.calc_area();
    R2.calc_area();
   }
}
