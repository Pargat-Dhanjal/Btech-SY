import Engineering.*;

import java.util.*;
class EXP_09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, roll_no;
        double m1, m2, m3;
        String Student_name, Subject_name;
        System.out.println("Enter no. of students");
        n = sc.nextInt();
        Student s[] = new Student[n];
        for (i = 0; i < s.length; i++)
        {
            System.out.println("For row "+(i+1)+", enter Name: ");
            Student_name = sc.next();
            sc.nextLine();
            System.out.println("For "+Student_name+", enter Roll Number: ");
            roll_no = sc.nextInt();
            System.out.println("For "+Student_name+", enter Course Name: ");
            Subject_name = sc.next();
            sc.nextLine();
            System.out.println("For "+Student_name+", enter marks in Subject 1: ");
            m1 = sc.nextDouble();
            System.out.println("For "+Student_name+", enter marks in Subject 2: ");
            m2 = sc.nextDouble();
            System.out.println("For "+Student_name+", enter marks in Subject 3: ");
            m3 = sc.nextDouble();
            s[i] = new Student(roll_no, Subject_name, Student_name, m1, m2, m3);
            s[i].tot = s[i].m1 + s[i].m2 + s[i].m3;
            s[i].perc = (float) (s[i].tot * 100) / 300;
        }
        for (i = 0; i < s.length; i++)
        {
            s[i].display();
        }

    }
}
