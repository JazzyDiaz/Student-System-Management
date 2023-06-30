import java.util.Map;
import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        System.out.println("STUDENT RECORD SYSTEM");
        System.out.println("_____________________");

        boolean quit = false;
        while (!quit) {
            System.out.println("1. Add Student");
            System.out.println("2. Submit Grade");
            System.out.println("3. Submit Attendance");
            System.out.println("4. Display Information");
            System.out.println("5. Exit");
            System.out.print("Please Enter: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Please Enter the Student Name: ");
                    String name = scanner.nextLine();
                    studentManager.addStudent(name);
                    System.out.println("Student Successfully Added!");
                    break;
                case 2:
                    System.out.print("Please Enter the Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Please Enter the Subject: ");
                    String subject = scanner.nextLine();
                    System.out.print("Please Enter the Grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine(); 
                    studentManager.submitGrade(studentName, subject, grade);
                    break;
                case 3:
                    System.out.print("Please Enter the Student Name: ");
                    String stuName = scanner.nextLine();
                    System.out.print("Please Enter Attendance Date: ");
                    String date = scanner.nextLine();
                    studentManager.submitAttendance(stuName, date);
                    break;
                case 4:
                    System.out.print("Please Enter the Student Name: ");
                    String sName = scanner.nextLine();
                    studentManager.displayInformation(sName);
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}