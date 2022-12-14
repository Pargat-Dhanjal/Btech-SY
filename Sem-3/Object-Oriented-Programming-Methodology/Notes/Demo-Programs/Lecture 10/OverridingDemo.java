class A 
{
   int i = 0;
   void doOverride (int k) 
  {
    i = k;
   System.out.println("The value of i is: "+i);
   }
 }
class B extends A 
{
   void doOverride(int k) 
  {
    i = 2 * k;
   System.out.println("The value of i is: "+i);
  }
}
class OverridingDemo
{
  public static void main (String args[])
 {	
    B b = new B(); 
    b.doOverride(12);
   A a1 = new B();
   a1.doOverride(20);
   A a2 = new A();
   a2.doOverride(20);
   B b1=new A();
   b1.doOverride(10);
 }
}
