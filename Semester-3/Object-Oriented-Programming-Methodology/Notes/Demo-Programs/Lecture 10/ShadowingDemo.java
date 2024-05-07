class Shadowing
{
   static void display()
   {
       System.out.println("In Static Method of Superclass");
    }
void instancemethod()
{
  System.out.println("In Instance Method of Superclass");
}
}

class ShadowingDemo extends Shadowing
{
   //Static methods are shadowed and not overriden
  static void display()
 {
       System.out.println("In Static Method of Subclass");
    }
    //Instance methods are overriden
   void instancemethod()
{
  //super.instancemethod();
  System.out.println("In Instance Method of Subclass");
}

public static void main(String[] args)
{
  Shadowing s = new ShadowingDemo();//access to the additional features of the subclass
  s.display();//early binding, method of superclass
  s.instancemethod();//late binding, overriden method will be called

  ShadowingDemo st = new ShadowingDemo();
  st.display();//early binding, method of subclass
  st.instancemethod();//latebinding, method of subclass
 }
}

  