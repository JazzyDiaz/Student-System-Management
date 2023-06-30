import java.util.List;
import java.util.ArrayList;
class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    public void submitGrade(String name, String subject, double grade) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.addGrade(subject, grade);
                System.out.println("Grade Successfully Submitted!");
                return;
            }
        }
        System.out.println("STUDENT NOT FOUND.");
    }

    public void submitAttendance(String name, String date) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.markAttendance(date);
                System.out.println("Attendance Successfully Submitted!");
                return;
            }
        }
        System.out.println("STUDENT NOT FOUND.");
    }

    public void displayInformation(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.displayInformation();
                return;
            }
        }
        System.out.println("STUDENT NOT FOUND.");
    }
}