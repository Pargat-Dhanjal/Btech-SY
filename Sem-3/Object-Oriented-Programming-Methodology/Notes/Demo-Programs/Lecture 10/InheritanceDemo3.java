class A {
A()
{ 
  System.out.println("Constructor A");
}
}
class B extends  A{
B()
{ 
  System.out.println("Constructor B");
}
}
class C extends  B{
C()
{
  System.out.println("Constructor C");
}
}
class InheritanceDemo3
{
   public static void main(String[] args)
  {
     C c1 = new C();
   }
}
  
  
