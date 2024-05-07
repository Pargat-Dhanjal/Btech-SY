package Exp7;
import java.util.Scanner;

class TimeException extends Exception {
    String msg;

    public TimeException(String s) {
        this.msg = s;
    }

    public String toString() {
        return (msg);
    }
}

public class Exp7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter minutes: ");
            int min = sc.nextInt();
            System.out.print("Enter seconds: ");
            int sec = sc.nextInt();
            if (sec > 60)
                throw new TimeException("seconds can't be more than 60 secs");
            else {
                sec=60*min+sec;
                System.out.println("Total Seconds is "+sec+"sec");
            }
        } catch (TimeException e) {
            System.out.print("TimeException Error: ");
            System.out.println(e.toString());
        }
    }
}
