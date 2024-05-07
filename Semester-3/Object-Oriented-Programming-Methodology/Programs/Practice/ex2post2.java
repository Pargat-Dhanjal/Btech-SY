import java.util.Scanner;

class ex2post2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        double ans=0;
        for(int i=1;i<=n;i++)
            ans=ans + 1.0/i;
        System.out.println("The answer is: "+ans);
    }
}
