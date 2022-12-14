import Mathematics.*;
import java.util.*;

class PackageExample
{
   public static void main(String[] args)
   {
      int a,b,sum,diff;
      Addition x = new Addition();
      Subtraction y = new Subtraction();
      Scanner sc = new Scanner (System.in);
     System.out.println("Enter the values of a and b:");
    a=sc.nextInt();
    b=sc.nextInt();
   sum = x.add(a,b);
   diff = y.sub(a,b);
   System.out.println("Sum of a and b is: " + sum);
   System.out.println("Difference of a and b is: " + diff);
   }
}
