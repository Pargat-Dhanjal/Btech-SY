class ThreadDemo4
{
   public static void main (String args[])
  {
     Ex t1 = new Ex("First");
     t1.x.start();
     
     Ex t2 = new Ex("Second");
     t2.x.start();
     
     Ex t3 = new Ex("Third");
     t3.x.start();

     for(int i=0;i<10;i++)
           System.out.println("Main thread");
   }
}

class Ex implements Runnable
{
    Thread x;
     
     Ex(String n)
     {
          x = new Thread(this,n);
      }

public void run()
{
   
   for(int i=0;i<10;i++)
      System.out.println(x.getName());
 }
}
 