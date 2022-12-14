public class Callbyvalue{
   public static void main(String[] args){
      int a = 30;
      int b = 45;
      System.out.println("Before swapping (in main), a = " + a + " and b = " + b);
      // Invoke the swap method
      swapMethod(a, b);
      System.out.println("After swapping (in main), a = " + a + " and b is " + b);
   }
   public static void swapMethod(int a, int b) {
      System.out.println("Before swapping(Inside method), a = " + a + " b = " + b);
      // Swap n1 with n2
      int c = a;
      a = b;
      b = c;
      System.out.println("After swapping(Inside method), a = " + a + " b = " + b);
   }
}