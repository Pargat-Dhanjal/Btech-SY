public class inter {
    public static void main(String[] args) {
        A ob1 = new A(95, 50, 80);
        B ob2 = new B(100, 80, 90, 70);
        System.out.println(ob1.getPerecentage());
        System.out.println(ob2.getPerecentage());
    }
}

abstract class Marks {
    abstract int getPerecentage();
}

class A extends Marks {
    int m1, m2, m3;

    A(int a, int b, int c) {
        this.m1 = a;
        this.m2 = b;
        this.m3 = c;
    }

    int getPerecentage() {
        return ((m1 + m2 + m3) / 3);
    }
}

class B extends Marks {
    int m1, m2, m3, m4;

    B(int a, int b, int c, int d) {
        this.m1 = a;
        this.m2 = b;
        this.m3 = c;
        this.m4 = d;
    }

    int getPerecentage() {
        return ((m1 + m2 + m3 + m4) / 4);
    }
}