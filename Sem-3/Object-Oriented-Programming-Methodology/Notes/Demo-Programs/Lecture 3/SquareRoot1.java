//Program to find squareroot of a number
/*This code finds out the squareroot of a number*/

import java.lang.Math;
import java.util.Scanner;

class SquareRoot1
{
   public static void main (String args[ ])
   {
      double x ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ");
      x=sc.nextDouble();
      double y;
      y = Math.sqrt(x);
      System.out.println ("y = " +y);
   }
}


//largest = (a>b)?a:b

//largest  = (a>b)?(a>c?a:c):(b>c?b:c)