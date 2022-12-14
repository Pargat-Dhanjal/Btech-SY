class Circle 
{
  float radius;
  final float PI = 3.141f; //value of pi is fixed
  Circle()
{
   radius = 1.0f;
 }
Circle(float radius) 
{
  this.radius = radius;
}
 float getArea() 
{
  return PI * radius * radius;
 }
}
class Cylinder extends Circle 
{
  float height;
  Cylinder(float radius, float height)
 {
    super(radius);
    this.height = height;
  }
float getArea()
{
    return 2 * super.getArea() + 2 * PI * radius * height;	
 }
}

class InheritanceExample
{
   public static void main (String [] args)
   {
      Circle c = new Circle(1.5f);
      System.out.println("The Area of Circle is: " + c.getArea());
      Cylinder cy = new Cylinder(1.5f,3.5f);
      System.out.println("The Surface Area of Cylinder is: " + cy.getArea());
   }
}

