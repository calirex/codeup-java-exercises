package grades;

import java.util.ArrayList;
import java.util.List;


public class Student {

//        private String name;
//        private ArrayList<Integer> grades;
//
//        public Student(String name) {
//            this.name = name;
//            this.grades = new ArrayList<>();
//        }
//
//        public String getName() {
//            return this.name;
//        }
//
//        public void addGrade(int grade) {
//            this.grades.add(grade);
//        }
//
//        public double getGradeAverage() {
//            int sum = 0;
//            for (int grade : this.grades) {
//                sum += grade;
//            }
//            return (double) sum / this.grades.size();
//        }

    private List<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (Double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

}
