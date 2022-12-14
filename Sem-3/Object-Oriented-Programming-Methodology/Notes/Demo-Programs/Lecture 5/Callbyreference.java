 class Modify
{
        int a;
       int b;

    Modify(int a, int b)
{
  this.a = a;
   this.b = b;
}
static void swapMethod(Modify m)
   {
     System.out.println("Before swapping(Inside method), a = " + m.a + " b = " + m.b);
     int c = m.a;
     m.a =m.b; 
     m.b = c;
     System.out.println("After swapping(Inside method), a = " + m.a + " b = " + m.b);
    }
}
 class Callbyreference
{
    public static void main (String[] args)
  {
       Modify mod = new Modify(30,45); 
       System.out.println("Before swapping ,(in main) a= " + mod.a + " b= " + mod.b );
        // Invoke the swap method     
       mod.swapMethod(mod);
       System.out.println("After swapping (in main), a= " + mod.a + " b= " + mod.b );
  }
   
 
 
}