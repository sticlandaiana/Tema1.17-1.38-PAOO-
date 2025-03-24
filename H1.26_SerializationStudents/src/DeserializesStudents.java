import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializesStudents {
    public static void main(String[] args) {
        List<Student> students = null;

        try {
            FileInputStream fileIn = new FileInputStream("students.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            students = (List<Student>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (students != null) {
            System.out.println("Deserialized Students:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
