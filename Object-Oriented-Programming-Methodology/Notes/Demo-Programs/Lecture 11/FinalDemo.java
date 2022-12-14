class A
{
   final int max=10;
   final void show(final int x)
  {
    // max++;
   // x++;
  System.out.println(x);
  }
}

class B extends A
{
   void display()
   {
        System.out.println(max);
    }
}

class FinalDemo 
{
   public static void main(String args[])
  {
     B b = new B();
     b.show(5);
     b.display();
 }
}
 
 
