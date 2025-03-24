package H128;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {


    static public void main(String[] args){
        ArrayList<Student> ourClass = new ArrayList<>();
        ourClass.add(new Student("Coco","Embedded C",2));
        ourClass.add(new Student("Ana","AI",2));
        ourClass.add(new Student("Ion","Data Structure",3));
        ourClass.add(new Student("Mihaela","Architecture",4));

        Gson gson = new Gson();
        String studentsJson = gson.toJson(ourClass);
        System.out.println(studentsJson);

        try{
            FileWriter writer = new FileWriter("students.txt");
            writer.write(studentsJson);
            writer.close();
            System.out.println("List of students saved in the file");

        }catch(IOException e){
            System.err.println("Error occurred :(");
        }


    }
}
