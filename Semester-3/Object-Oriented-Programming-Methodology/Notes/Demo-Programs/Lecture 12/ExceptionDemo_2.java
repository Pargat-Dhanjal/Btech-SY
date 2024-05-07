class ExceptionDemo_2
{
         public static void main (String[] args)
         {
             int numer [] = { 4, 8, 16, 32, 64, 128, 512};
             int denom [] = {2,  0,  4,   4,   0,   8};

           for(int i=0;i<numer.length;i++)
           {
              try {
               System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
              }
             catch (ArithmeticException e)
             {
                 System.out.println("Can't divide by zero");
              }
             catch(ArrayIndexOutOfBoundsException e)
             {
                 System.out.println("No matching elements found");
              }
           }
        }
 }