class ThreadDemo3
{
   public static void main (String args[])
  {
     Ex t =new Ex("One");
  //Public reference to call start method. This informs JVM to schedule this thread, run method gets called.   
     t.x.start();
    for(int i=0;i<10;i++)
             System.out.println("Main thread");
   }
 }

class Ex implements Runnable
{
    public Thread x;
    Ex(String n)//Constructor for creating object of Ex class
   {
     x = new Thread(this,n);//Object of thread class created and its address stored in a public reference called x
    }
public void run()
{
for(int i=0;i<10;i++)
   System.out.println(x.getName());
 }
}
