package H128;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithStudents {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("students.txt");
            Gson gson = new Gson();


            Type studentListType = new TypeToken<ArrayList<Student>>() {}.getType();
            ArrayList<Student> ourClass = gson.fromJson(reader, studentListType);


            System.out.println("A list of students read from a file: ");
            for (Student s : ourClass) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
