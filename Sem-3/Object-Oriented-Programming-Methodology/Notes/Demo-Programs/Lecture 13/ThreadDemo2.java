class ThreadDemo2
{
   public static void main (String args[])
   {
      Ex t1 = new Ex();
      t1.start();
      t1.setName("First");
      Ex t2 = new Ex();
      t2.start();
      t2.setName("Second");
      Ex t3 = new Ex();
     t3.start();
      t3.setName("Third");
      try
      {
             for (int i=0;i<10;i++)
              {
                   System.out.println("Main thread");
                   Thread.sleep(500);
              }
        }
       catch(Exception e) { System.out.println("Exception");}
      
System.out.println(t1.isAlive());
System.out.println(t2.isAlive());
System.out.println(t3.isAlive());
try
{
   t1.join();
   t2.join();
  t3.join();
  }
catch (Exception e) {System.out.println("Exception");} 

System.out.println(t1.isAlive());
System.out.println(t2.isAlive());
System.out.println(t3.isAlive());
   }
}
class Ex extends Thread
{
   public void run()
  {
          Thread t;
          t=Thread.currentThread();
          String s = t.getName();
          for(int i=0;i<10;i++)
             System.out.println(s);
   }
}
