package Engineering;
import java.util.Scanner;
public class Student {
    Scanner scanner = new Scanner (System.in);
    public int RollNo [];
    public String StudentName[];
    public int MarksMaths[];
    public int MarksPhysics [];
    public int MarksChemistry [];
    public double MarksTotal [];

    public Student ()
    {
        System.out.print ("Enter number of students: ");
        int n = scanner.nextInt();

        RollNo = new int [n];
        StudentName = new String [n];
        MarksMaths = new int [n];
        MarksPhysics = new int [n];
        MarksChemistry = new int [n];
        MarksTotal = new double [n];
    }

    public Student (int n)
    {
        RollNo = new int [n];
        StudentName = new String [n];
        MarksMaths = new int [n];
        MarksPhysics = new int [n];
        MarksChemistry = new int [n];
        MarksTotal = new double [n];
    }

    public void getDetails ()
    {
        for (int i = 0; i < RollNo.length; i++)
        {
            System.out.println ("\nDetails for student " + (i+1));
            System.out.print ("Enter roll number of the student: ");
            RollNo[i] = scanner.nextInt();

            System.out.print ("Enter name of the student: ");
            String trash = scanner.nextLine();
            StudentName[i] = scanner.nextLine();

            System.out.print ("Enter marks in maths: ");
            MarksMaths[i] = scanner.nextInt();

            System.out.print ("Enter marks in physics: ");
            MarksPhysics[i] = scanner.nextInt();

            System.out.print ("Enter marks in chemistry: ");
            MarksChemistry[i] = scanner.nextInt();
        }
    }

    public void calculateTotal ()
    {
        // System.out.println ("\nTotal marks for students ");
        for (int i = 0; i < MarksTotal.length; i++) {
            MarksTotal[i] = (MarksMaths[i] + MarksPhysics[i] + MarksChemistry[i]);
            // System.out.print (MarksTotal[i] + "  ");
        }
    }
}
