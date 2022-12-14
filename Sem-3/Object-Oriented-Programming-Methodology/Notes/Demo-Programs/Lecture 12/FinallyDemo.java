class FinallyDemo
{
    public static void main (String [] args)
   {
           method1();
           System.out.println("Result : "+method2(24,0));//Line 6
 }
           static void method1()
      {
           try
           {
                       System.out.println("In Method 1");
                       throw new NullPointerException();
            }
            catch(Exception e)
           {
                      System.out.println("Exception handled: " + e);
            }
         finally 
        {
              System.out.println("In method 1 finally");
         }
        }
     static int method2(int a , int b)
      {
           try
           {
                     System.out.println("In method 2");
                    return a/b;//Line 29
            }
            finally
           {
                 System.out.println("In method 2 finally");
          }
     }
}
              
          
 