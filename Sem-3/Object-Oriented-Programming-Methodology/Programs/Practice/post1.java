import java.util.*;
class post1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(">>Enter Cirle Radius: ");
        double r=sc.nextDouble();
        circle.area(r);
        circle.circum(r);
    }
}
class circle{
    static void area(double r){
        System.out.println(">>The Area of circle is: "+(3.14*r*r));
    }
    static void circum(double r){
        System.out.println(">>The Circumference of circle is: "+(2*3.14*r));
    }
}