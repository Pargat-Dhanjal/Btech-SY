class A 
{
   void show()
 {
   System.out.println("Super Class show method");
 } 
}
class B extends A
{
  void show()
{
   System.out.println("Subclass show method");
}
}
class SuperDemo
{
  public static void main (String args[ ])
 {
   A s1=new A();
   s1.show();//Superclass method
   B s2=new B ();
   s2.show();//Subclass method
 }
}

