import java.util.Scanner;
// You are using Java
class Student {
      //type your code here
    double calculatePercentage(int TM,int OM){
        double a = ((double)OM/TM)*100;
        return a;
    }
}

class ScholarshipStudent extends Student {
      //type your code here
    // @Override
    double calculatePercentage(int TM,int OM){
        double a = (((double)OM/TM)*100)+5;
        return a;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent();

        int totalMarks = scanner.nextInt();
        int obtainedMarks = scanner.nextInt();

        double studentPercentage = student.calculatePercentage(totalMarks, obtainedMarks);
        double scholarshipStudentPercentage = scholarshipStudent.calculatePercentage(totalMarks, obtainedMarks);

        System.out.printf("Student Percentage: %.2f%%\n", studentPercentage);
        System.out.printf("Scholarship Student Percentage: %.2f%%\n", scholarshipStudentPercentage);

        scanner.close();
    }
}
