import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class SerializesStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ana", "Computer Science", 2));
        students.add(new Student("Ion", "Mathematics", 3));
        students.add(new Student("Mihaela", "Physics", 1));

        try {
            FileOutputStream fileOut = new FileOutputStream("students.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(students);
            out.close();
            fileOut.close();
            System.out.println("Serialized data saved in students.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
