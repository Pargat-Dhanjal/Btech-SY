class ThreadDemo1
{
   public static void main (String args[])
  {
     Ex t = new Ex();
     t.start();
    try
   {
     for(int i=0;i<5;i++)
      {
         System.out.println("Main thread");
         Thread.sleep(1000);
       }
      }
    catch(Exception e) { System.out.println("Exception");}
    }
}
    
   

class Ex extends Thread
{
  public void run()
{
  try
  {
     for(int i=0;i<5;i++)
      {
        System.out.println("New thread");
       Thread.sleep(1000);
       }
    } 
     catch(Exception e) { System.out.println("Exception");}
    }
  } 

     

