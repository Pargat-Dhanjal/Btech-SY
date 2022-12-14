class post2 {
    public static void main(String[] args) {
        int a = 15, b = 150;
        System.out.println("G.C.D is: "+gcd(a,b));
    }
    public static int gcd(int a, int b) {
        if (b != 0)
            return gcd(b, a % b);
        else
            return a;
    }
}