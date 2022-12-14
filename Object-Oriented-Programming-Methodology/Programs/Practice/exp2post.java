import java.util.Scanner;

class exp2post {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a>b){
            if(a>c)
                System.out.println(a+" is the largest");
            else
                System.out.println(c+" is the largest");
        }
        else{
            if(b>c)
                System.out.println(b+" is the largest");
            else
                System.out.println(c+" is the largest");
        }
    }
}
