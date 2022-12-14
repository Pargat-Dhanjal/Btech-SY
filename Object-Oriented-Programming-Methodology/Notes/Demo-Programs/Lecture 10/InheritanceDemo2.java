//base class
class A  
{
 int count = 30;

}

//derived class
class B extends A
{
  int count = 100;

  void display()   
{
   System.out.println("B variable count: " +count);
   System.out.println("A variable count: " +super.count);
}
}
class C extends B
{
int count = 500;
void display()
{
   super.display();
     System.out.println("C variable count: " +count);
}
}
class InheritanceDemo2
{
    public static void main (String[] args)
 {
   C c = new C();
   c.display();
  }
 }