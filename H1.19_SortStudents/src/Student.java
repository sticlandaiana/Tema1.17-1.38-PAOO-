public class Student implements Comparable<Student>{

    private String name;
    private double grade;

    public Student(String name, double grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName(){
        return name;
    }

    public double getGrade(){
        return grade;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }

}
