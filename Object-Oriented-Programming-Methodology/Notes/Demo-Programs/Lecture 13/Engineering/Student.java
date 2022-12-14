package Engineering;
import java.util.*;
public class Student
{
    public int roll_no;
    public String Subject_name, Student_name;
    public double m1, m2, m3, tot, perc;
    public Student(int roll_no, String Subject_name, String Student_name, double m1, double m2, double m3)
    {
        this.roll_no = roll_no;
        this.Subject_name = Subject_name;
        this.Student_name = Student_name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.tot = 0.0;
        this.perc = 0.0;
    }
    public void display()
    {
        System.out.println(Student_name+"\t"+roll_no+"\t"+Subject_name+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+tot+"\t"+perc);
    }
}
