//Invoking meethods using super keyword
class ANew
{
  void show()
 {
   System.out.println("Super Class show method");
  }
 }
class BNew extends ANew
 {
    void show()
   {
      super.show(); 
      System.out.println("Subclass show method");
    }
}
class SuperDemo1
{
    public static void main (String args[ ]) 
  {
    BNew s2=new BNew ();
    s2.show();
   }
}

