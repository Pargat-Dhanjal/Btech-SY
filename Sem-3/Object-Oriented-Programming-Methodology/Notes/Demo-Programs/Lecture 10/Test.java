class A {
    public int i;
    protected int j;
 }
class B extends A {
   void display()
   {
       super.j=super.i+1;
       System.out.println(super.i+""+super.j);
       
   }
} 
public class Test
{
	public static void main(String[] args) {
		B obj = new B();
		obj.i=2;
		obj.j=2;
		obj.display();
	}
}