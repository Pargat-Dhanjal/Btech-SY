import java.util.Scanner;

class exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2^5 is: " + myMath.power(2, 5));
        System.out.println("5 factorial is: " + myMath.fact(5));
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("(1+x)^n : "+myMath.series(n, x));
        System.out.println("e^x for first n terms: "+myMath.expo(n, x));

    }
}

class myMath {
    static double power(double x, int y) {
        double ans = 1;
        for (int i = 0; i < y; i++)
            ans = ans * x;
        return ans;
    }

    static int fact(int n) {
        if (n > 1)
            return n * fact(n - 1);
        else
            return 1;
    }

    static double expo(int n, double x) {
        double ans = 0;
        for (int i = 0; i < n; i++)
            ans = ans + (power(x, i) / fact(i));
        return ans;
    }

    static double series(int n, double x) {
        double ans = 0;
        for (int i = 0; i <= n; i++)
            ans = ans + (power(x, i) * (fact(n) / fact(n - i))) / fact(i);
        return ans;
    }
}