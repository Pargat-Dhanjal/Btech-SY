class GFG {
 
    // static method
    public static int sum1(int a, int b)
    {
        return a + b;
    }
    public int sum2(int a, int b)
{ 
   return a+b;
}
  
}
 
class Staticsum {
    public static void main(String[] args)
    {
        int n = 3, m = 6;
 
        // call the static method
        int s = GFG.sum1(n, m);
      //  int r = GFG.sum2(n,m); 
       System.out.println("Static method");
        System.out.println("sum is = " + s);
       // System.out.println("sum non-static method using class is = " + s);
      //call the non-static method
      GFG g = new GFG();
      int p = g.sum2(n,m);
      int q = g.sum1(n,m);  
     System.out.println("Non-static method");
     System.out.println("sum is = " + p);
     System.out.println("sum static method using object is = " + q);
    }
}