class SuperClass 
{
   int instanceVariable = 10;
   static int classVariable = 20;
}
class SubClass extends SuperClass
{
   int instanceVariable = 12;
   static int classVariable = 25;
 }
class InheritanceDemo4
{
   public static void main(String args[]) 
{
   SuperClass s=new SubClass();
   System.out.println("Superclass Instance variable: "+s.instanceVariable);
   System.out.println("Superclass static variable: "+s.classVariable);
   SubClass st=new SubClass();
   System.out.println("Subclass Instance variable: "+st.instanceVariable);
   System.out.println("Subclass static variable: "+st.classVariable); 
} 
}

