//Program to find the largest of three numbers

import java.util.Scanner;

class ifelse
{
  void large(int a, int b, int c)
  {
    if (a>b)
    {
       if(a>c)
        System.out.println("Largest is: "+a);
       else
        System.out.println("Largest is: "+c);
      }
    else if(b>c)
       System.out.println("Largest is: "+b);
     else 
       System.out.println("Largest is: "+c);
   }
}

class condition
{
  void larger(int a, int b, int c)
   {
      int d;
      d=(a>b)?(a>c?a:c):(b>c?b:c);
      System.out.println("Largest of three numbers is is: "+d);
    }
}

class Largest
{
public static void main (String args[])
{
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of a:");
   a=sc.nextInt();
   System.out.println("Enter the value of b:");
   b=sc.nextInt();
   System.out.println("Enter the value of c:");
   c=sc.nextInt();
   ifelse a1 = new ifelse();
   a1.large(a,b,c);
   condition b1 = new condition();
   b1.larger(a,b,c);
 }
}
  
   
    
     