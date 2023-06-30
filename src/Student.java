import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Student {
    private String fname;
    private Map<String, Double> grade;
    private Map<String, Double> grades = new HashMap<>();
    private List<String> attend;

    public Student(String name) {
        this.fname = fname;
        this.grade = new HashMap<>();
        this.attend = new ArrayList<>();
    }

    public String getName() {
        return fname;
    }

    public void addGrade(String subject, double grade) {
       grades.put(subject, grade);
    }

    public void markAttendance(String date) {
        attend.add(date);
    }

    public double getAverageGrade() {
        if (grade.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grade.values()) {
            sum += grade;
        }
        return sum / grade.size();
    }

    public void displayInformation() {
        System.out.println("Student Name: " + fname);
        System.out.println("Grades: " + grade);
        System.out.println("Attendance: " + attend);
        System.out.println("Average Grade: " + getAverageGrade());
        System.out.println("_________________________");
    }
}

