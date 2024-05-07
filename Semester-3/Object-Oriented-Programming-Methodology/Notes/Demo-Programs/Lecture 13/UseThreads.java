class MyThread implements Runnable
{
  String thrdName;
  MyThread(String name)
  {
     thrdName = name;
   }

   public void run()
   {
      System.out.println(thrdName + " starting ");
      try 
      {
          for(int count=0; count < 10 ; count++)
          {
              Thread.sleep(400);
               System.out.println("In" + thrdName + " count is " + count);
           }
       }
       catch (Exception ex)
       {   }
       System.out.println(thrdName + " terminating ");
    }
  }

class UseThreads
{
    public static void main (String [] args)
    {
           System.out.println("Main thread starting");
            MyThread mt = new MyThread("Child#1"); //create a runnable object
           Thread newThrd = new Thread (mt); //create a thread on that object
           newThrd.start(); //Start running the thread	

            for(int i=0; i < 50; i++)
            {
                System.out.println(".");
                try 
                {
                     Thread.sleep(100);
                 }
                 catch(Exception ex)
                 { System.out.println("Exception");}
               }
             System.out.println("Main Thread ending");
        }
} 