class ExceptionDemo_4
{
   public static void main (String[] args){
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
try{
      method3(4,0);
    }
  catch(Exception e)
  {
       System.out.println("Exception handled:" + e);
   }
  System.out.println("Returned from method 3");
}
static void method3(int a, int b) throws Exception
{
    System.out.println("In method 3");
    if(b==0)
      throw new ArithmeticException("Testing throw");
   else
     System.out.println("Result: "+a/b);
  }
} 
  
