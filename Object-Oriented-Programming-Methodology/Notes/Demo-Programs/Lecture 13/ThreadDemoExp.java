import java.util.*;

class Sum extends Thread
{
   int x;
   int y;
   Sum(int a, int b)
  {
    x = a;
    y = b;
  }
  public void run() 
  {
     int sum = x + y;
    System.out.println("Sum is: " + sum);
   
  }
}

class Diff extends Thread
{
  int x;
  int y;
  Diff(int a, int b)
 {
   x = a;
   y = b;
 }
 public void run()
{
  int diff = x - y;
   System.out.println("Difference is: " + diff);
   
 }
}  
class Number extends Thread
{
   public void run()
   {
      Random random = new Random();
     for(int i=0; i<5;i++)
     {
        int randomInteger = random.nextInt(100);
        System.out.println("Random Integer generated: " + randomInteger);
        Sum a1 = new Sum(randomInteger,5);
        a1.start();
        Diff d1 = new Diff(randomInteger,6);
        d1.start();
        try { Thread.sleep(1000);} 
        catch (Exception e) {System.out.println(e);}
     }
   }
}

class ThreadDemoExp
{
  public static void main (String args[])
{
   Number n = new Number();
   n.start();
 }
} 


   
   
   