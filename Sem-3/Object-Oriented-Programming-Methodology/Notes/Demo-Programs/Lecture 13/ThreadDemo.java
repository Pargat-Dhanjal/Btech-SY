class ThreadDemo
{
   public static void main(String args[])
  {
     Ex t = new Ex();
     t.start();
    
         for(int i=0;i<5;i++)
         { 
            System.out.println("Main Thread");
         
          }
      }
         
       
    }



   class Ex extends Thread
{
    public void run()
    {
      
          for (int i=0;i<5;i++)
           {
               System.out.println("New Thread");
               //Thread.sleep(1000);
             }
        
           
     }
}

  