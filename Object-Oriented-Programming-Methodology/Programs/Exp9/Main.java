import Engineering.*;
public class Main {
    public static void main(String[] args) {
        Student student = new Student ();
        Student sorted = new Student (student.RollNo.length);

        student.getDetails();
        student.calculateTotal();
        sorted = Marks.sort(student);
        Marks.display(sorted);
    }
}
