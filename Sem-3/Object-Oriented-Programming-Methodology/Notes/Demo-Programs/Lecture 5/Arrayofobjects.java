class Arrayofobjects
{
   int i;
   double a;

  Arrayofobjects(int i, double a)
 {
  this.i = i;
  this.a = a;
 }
 
public void display()
{
   System.out.println("i = " + i + " a = " + a);
}


public static void main (String[] args)
{
   Arrayofobjects [] arr = new Arrayofobjects [3];
   arr[0]=new Arrayofobjects (10,3.14);
   arr[1]=new Arrayofobjects (20,6.28);
   arr[2]=new Arrayofobjects (30,6.55);
for (Arrayofobjects s : arr) //for-each
s.display();
}
}
