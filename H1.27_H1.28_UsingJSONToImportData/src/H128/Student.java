package H128;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String profile;
    private int yearOfStudy;


    public Student(String name, String profile, int yearOfStudy) {
        this.name = name;
        this.profile = profile;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student[name='" + name + "', profile='" + profile + "', yearOfStudy=" + yearOfStudy + "]";
    }
}