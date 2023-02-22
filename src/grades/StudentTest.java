package grades;

public class StudentTest {
    public static void main(String[] args) {


        Student student = new Student("Alice");
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(95);
        System.out.println("Name: " + student.getName());
        System.out.println("Average grade: " + student.getGradeAverage());


    }
}
