class Exception1Demo
{
   public static void main(String [] args)
 {
    method1();
  }
static void method1()
{
   System.out.println("In method 1, calling method 2");
   method2();
   System.out.println("Returned from method 2");
 }
static void method2()
{
   System.out.println("In method 2, calling method 3");
    method3();
}

static void method3()
{
   System.out.println("In method 3");
   int a = 10, b = 0;
   int c = a/b;
   System.out.println("Method 3 exits");
  }
}