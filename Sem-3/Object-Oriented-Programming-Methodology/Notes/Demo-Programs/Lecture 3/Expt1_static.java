import java.util.Scanner;

class Complex
{
       static double real;
       static double img;
       Complex(double a, double b)
       {
           real=a;
           img=b;
        }
       Complex()
      {
          real = 0;
          img = 0;
       }
      
   void getdata(double real, double img)
  {
     this.real=real;
     this.img=img;
   }
      static add(Complex C1, Complex C2)
      {
          
           real = C1. real + C2.real;
            img = C1.img + C2.img;
          
      }
      void display()
      {
        if(img>0)
       {
           System.out.println(real+"+j"+img);
        }
        if(img<0)
       { 
           System.out.println(real+"-j"+img);   
       }
}
}

class Expt1_static
{
    public static void main (String args[])
   {
       double a,b,c,d;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of real part");
       a = sc.nextDouble();
       System.out.println("Enter the value of imaginary part");
       b = sc.nextDouble();
       Complex C1 = new Complex();
      C1.getdata(a,b)
     C
      C1.display();
      
       System.out.println("Enter the value of real part");
       c = sc.nextDouble();
       System.out.println("Enter the value of imaginary part");
       d = sc.nextDouble();
       Complex C2 = new Complex();
        C2.getdata(c,d);
       C2.display();

       Complex C3 = new Complex();
       
       
     }
}
      
