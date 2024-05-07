class Cube
{
  double length, breadth, height, volume;
  Cube()//Default constructor
 {
    length = 1;
    breadth = 2;
    height = 3;
 }
Cube(double l, double b, double h)//Parameterized constructor
{
 length = l;
 breadth = b;
 height = h;
}
Cube(int l,int b,int h)

{
 length = l;
 breadth = b;
 height = h;
System.out.println("XYZ");
}

double Volume()
{
  volume=length*breadth*height;
  return volume;
}

public static void main (String args[])
{
  Cube c3 = new Cube();//Default
  Cube c1 = new Cube(2.0,3.0,4.0);//Parameterized
  Cube c2 = new Cube(10,10,10);//Parameterized
System.out.println("First cube");
System.out.println("Volume is: "+c1.Volume());
System.out.println("Second cube");
System.out.println("Volume is: "+c2.Volume());
System.out.println("Third cube");
System.out.println("Volume is: "+c3.Volume());

}
}

