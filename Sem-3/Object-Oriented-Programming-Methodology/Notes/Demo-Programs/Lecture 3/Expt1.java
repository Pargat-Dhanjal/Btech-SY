import java.util.Scanner;

class Complex
{
        double real;
        double img;
       Complex(double real, double img)
       {
           this.real=real;
           this.img=img;
        }
       Complex()
      {
          real = 0;
          img = 0;
       }
       void getdata(double real, double img)
      {
        this.real = real;
        this.img = img;
       }
      static Complex add(Complex C1, Complex C2)
      {
            Complex sum = new Complex();
            sum.real = C1.real+C2.real;
            sum.img = C1.img+C2.img;
            return sum;
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

class Expt1
{
    public static void main (String args[])
   {
       double a,b,c,d;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of real part");
       a = sc.nextDouble();
       System.out.println("Enter the value of imaginary part");
       b = sc.nextDouble();
       Complex C1 = new Complex(a,b);
      
      
       System.out.println("Enter the value of real part");
       c = sc.nextDouble();
       System.out.println("Enter the value of imaginary part");
       d = sc.nextDouble();
       Complex C2 = new Complex();
       C2.getdata(c,d);

       Complex C3 = Complex.add(C1,C2);
       C3.display();
       
     }
}
      
