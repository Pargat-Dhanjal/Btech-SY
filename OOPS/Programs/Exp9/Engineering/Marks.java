package Engineering;
public class Marks {
    public static Student sort (Student students)
    {
        Student sorted = new Student (students.MarksTotal.length);
        double toSort [] = students.MarksTotal;
        int indexArr [] = new int [students.MarksTotal.length];

        double min;
        int minInd = 0;

        for (int i = 0; i < indexArr.length; i++) {
            indexArr[i] = i;
        }

        for (int i = 0; i < indexArr.length; i++) {
            min = toSort[i];
            minInd = i;

            // find minInd
            for (int j = i; j < indexArr.length; j++) {
                if (toSort[j] < min) {
                    minInd = i;
                }
            }

            // swap minInd with i
            int temp = indexArr[i];
            indexArr[i] = indexArr[minInd];
            indexArr[minInd] = temp;
        }

        // now sort

        for (int i = 0; i < indexArr.length; i++) {
            int ind = indexArr[i];

            // move students[ind] to sorted[i]
            sorted.RollNo[i] = students.RollNo[ind];
            sorted.StudentName[i] = students.StudentName[ind];
            sorted.MarksChemistry[i] = students.MarksChemistry[ind];
            sorted.MarksMaths[i] = students.MarksMaths[ind];
            sorted.MarksPhysics[i] = students.MarksPhysics[ind];
            sorted.MarksTotal[i] = students.MarksTotal[ind];
        }

        return sorted;
    }

    public static void display (Student students)
    {
        System.out.println("\nDetails of students");

        for (int i = 0; i < students.RollNo.length; i++) {
            System.out.println("\nStudent "+(i+1));
            System.out.println("Student Roll Number: " + students.RollNo[i]);
            System.out.println("Student Name: " + students.StudentName[i]);
            System.out.println("Marks in Physics: " + students.MarksPhysics[i]);
            System.out.println("Marks in Chemistry: " + students.MarksChemistry[i]);
            System.out.println("Marks in Maths: " + students.MarksMaths[i]);
            System.out.println("Total Marks: " + students.MarksTotal[i]);
        }
    }
}
