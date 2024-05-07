class ExceptionDemo extends Exception
{
   ExceptionDemo(String msg)
  {
     super(msg);
   }
  public String toString()
 {
      return "Exception in thread  main ExceptionDemo Exception:" +getMessage();
  }
}

class TestException
{
  static void testException() throws ExceptionDemo
  {
     throw new ExceptionDemo("Testing User Defined Exception");
   }
public static void main(String args[])
{
   try
  {
    testException();
   }
   catch(ExceptionDemo e)
   {
     System.out.println(e);
    }
 }
}