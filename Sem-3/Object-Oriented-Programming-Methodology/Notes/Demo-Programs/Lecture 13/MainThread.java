class MainThread
{
   public static void main (String args[])
   {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("myThread");
        System.out.println("After name change: "+ t);
        String s = t.getName();
        System.out.println("Thread Name: " + s);
    }
}
        