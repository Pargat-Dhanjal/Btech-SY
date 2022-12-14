//base class
class Index  
{
 protected int count;

  Index()
  {
     count =5;
   }

 void display() //method in base class
{
  System.out.println("count = " + count);
}

public void increment()
{
   count+=1;
}
}

//derived class
class Index1 extends Index
{
  public void decrement()
  {
    count-=1;
  }
  void display()   //method in derived class//method overriding
{
  super.display();//call to the display method in super class
   System.out.println("Display in derived class count = " +count);
}
}
class InheritanceDemo
{
    public static void main (String[] args)
 {
  //Index i = new Index();
//  i.display();
  Index1 i1 = new Index1();
  i1.display();
 }
}
