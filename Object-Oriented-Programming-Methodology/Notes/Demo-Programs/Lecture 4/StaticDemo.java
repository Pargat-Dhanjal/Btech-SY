class StaticDemo1
{
   int x;
  static int y;
 
void setX(int a)
{
   x = a;
System.out.println("x="+x);
  }

static void setY(int b)
{
   y = b;
  System.out.println("y="+y);
}
}
class StaticDemo
{
   public static void main(String args[])
   {
      StaticDemo1 S1 = new StaticDemo1();
     S1.setX(5);
     S1.setY(6);
     //StaticDemo1.setX(7);
     StaticDemo1.setY(8);
  }
}
  