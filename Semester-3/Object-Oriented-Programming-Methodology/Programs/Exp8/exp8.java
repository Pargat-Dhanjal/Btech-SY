import java.util.Random;

class random extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int x = r.nextInt(100);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            } finally {
                Square obj2 = new Square(x);
                Cube obj3 = new Cube(x);
                if (x % 2 == 0)
                    obj2.start();
                else
                    obj3.start();
            }
        }
    }
}

class Square extends Thread {
    public int x;

    public Square(int x) {
        this.x = x;
    }

public void run()
{
System.out.println("Random Number is "+x+", Square is: "+x*x);
}
}

class Cube extends Thread {
    int x;

    Cube(int x) {
        this.x = x;
    }

public void run()
{
System.out.println("Random Number is "+x+", Cube is : "+x*x*x);
}
}

public class exp8 {
    public static void main(String args[]) {
        random obj1 = new random();
        obj1.start();
    }
}