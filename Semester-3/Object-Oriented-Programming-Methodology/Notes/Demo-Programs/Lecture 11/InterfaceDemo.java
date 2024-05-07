interface A {
  void showA();
}

interface B extends A {
void showB();
}
class InterfaceDemo implements B {
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
   InterfaceDemo d = new InterfaceDemo();
   d.showA();
   d.showB();
  }
}