class ExceptionDemo_1
{
         public static void main (String[] args)
       {
         int nums [] = new int [4];
         try {
         System.out.println("Before exception is generated");

        //Generate an exception
        nums[7] = 10;
       }
       catch (ArrayIndexOutOfBoundsException e)  
      {
           System.out.println("Index out-of-bounds" +e);
       }
      System.out.println("After catch statement");
  }
}
 