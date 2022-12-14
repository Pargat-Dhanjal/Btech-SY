package Exp1;
import java.util.Scanner;

class exp1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Real Part for num1: ");
        double real = sc.nextDouble();
        System.out.print("Enter Img Part for num1: ");
        double img = sc.nextDouble();
        // Creating a complex number num1
        complex num1 = new complex(real, img);
        System.out.print("Enter Real Part for num2: ");
        real = sc.nextInt();
        System.out.print("Enter Img Part for num2: ");
        img = sc.nextInt();
        // Creating a complex number num2
        complex num2 = new complex(real, img);
        // Calling static methods
        complex.add(num1, num2);
        complex.sub(num1, num2);
        // Calling non-static methods
        num1.multi(num1, num2);
        num2.div(num1, num2);
        sc.close();
    }
}

class complex {
    double r, i;

    complex(double r, double i) {
        this.r = r;
        this.i = i;
    }

    static void add(complex num1, complex num2) {
        System.out.println("Addition Result:");
        System.out.println("The Real part is: " + (num1.r + num2.r) + " Imaginary part is: " + (num1.i + num2.i));
    }

    static void sub(complex num1, complex num2) {
        System.out.println("Subtraction Result:");
        System.out.println("The Real part is: " + (num1.r - num2.r) + " Imaginary part is: " + (num1.i - num2.i));
    }

    void multi(complex num1, complex num2) {
        System.out.println("Multiplication Result:");
        double real, img;
        real = (num1.r * num2.r) - (num1.i * num2.i);
        img = (num1.r * num2.i) + (num1.i * num2.r);
        System.out.println("The Real part is: " + real + " Imaginary part is: " + img);
    }

    void div(complex num1, complex num2) {
        System.out.println("Division Result:");
        double den = (num2.r * num2.r) + (num2.i * num2.i);
        double real = (num1.r * num2.r) + (num1.i * num2.i);
        double img = (num1.i * num2.r) - (num1.r * num2.i);
        System.out.println("The Real part is: " + real / den + " Imaginary part is: " + img / den);
    }
}