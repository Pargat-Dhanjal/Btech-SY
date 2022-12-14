interface A {
  void showA();
}

interface B{
void showB();
}
class InterfaceDemo1 implements A,B {
public void showA()
{
   System.out.println("Overriden method of interface A");
 }
 public void showB()
 {
    System.out.println("Overriden method of interface B");
 }
public static void main (String args[])
{
   InterfaceDemo1 d = new InterfaceDemo1();
   d.showA();
   d.showB();
  }
}