package Exp1;
import java.util.Scanner;

class exp1a {
    static void add(double r1,double i1,double r2,double i2) {
        System.out.println("Addition Result:");
        System.out.println("The Real part is: " + (r1+r2) + " Imaginary part is: " + (i1 + i2));
    }

    static void sub(double r1,double i1,double r2,double i2) {
        System.out.println("Subtraction Result:");
        System.out.println("The Real part is: " + (r1 - r2) + " Imaginary part is: " + (i1 - i2));
    }

    static void multi(double r1,double i1,double r2,double i2) {
        System.out.println("Multiplication Result:");
        double real, img;
        real = (r1 * r2) - (i1 * i2);
        img = (r1 * i2) + (i1 * r2);
        System.out.println("The Real part is: " + real + " Imaginary part is: " + img);
    }

    static void div(double r1,double i1,double r2,double i2) {
        System.out.println("Division Result:");
        double den = (r2 * r2) + (i2 * i2);
        double real = (r1 * r2) + (i1 * i2);
        double img = (i1 * r2) - (r1 * i2);
        System.out.println("The Real part is: " + real / den + " Imaginary part is: " + img / den);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Real Part for num1: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter Img Part for num1: ");
        double img1 = sc.nextDouble();
        System.out.print("Enter Real Part for num2: ");
        double real2 = sc.nextInt();
        System.out.print("Enter Img Part for num2: ");
        double img2 = sc.nextInt();
        exp1a.add(real1, img1, real2, img2);
        exp1a.sub(real1, img1, real2, img2);
        // Calling non-static methods
        exp1a.multi(real1, img1, real2, img2);
        exp1a.div(real1, img1, real2, img2);
        sc.close();
    }
}