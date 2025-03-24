import java.util.ArrayList;
import java.util.Collections;
public class Main {

    static public void main(String[] args){


        Student s1 = new Student("Ana",10);
        Student s2 = new Student("Ion",9);
        Student s3 = new Student("Melania",10);
        Student s4 = new Student("Gheorghe", 6);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        Collections.sort(students);

        System.out.println("Sorted students");
        for(Student s: students){
            System.out.println("name: "+s.getName()+" -> grade: "+ s.getGrade());
        }

    }
}
