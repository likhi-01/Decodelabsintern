import java.util.*;

public class GradingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======= STUDENT GRADE CALCULATOR =======");

        System.out.print("Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Number of Subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        System.out.println("======= ENTER MARKS =======");

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks for Subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            totalMarks += marks;
        }

        double average = (double) totalMarks / subjects;

        String grade;
        String result;

        if (average >= 90) {
            grade = "A+";
            result = "PASS";
        } else if (average >= 80) {
            grade = "A";
            result = "PASS";
        } else if (average >= 70) {
            grade = "B+";
            result = "PASS";
        } else if (average >= 60) {
            grade = "B";
            result = "PASS";
        } else if (average >= 50) {
            grade = "C";
            result = "PASS";
        } else if (average >= 40) {
            grade = "D";
            result = "PASS";
        } else {
            grade = "F";
            result = "FAIL";
        }

        System.out.println("\n======= RESULT =======");
        System.out.println("Student Name     : " + studentName);
        System.out.println("Total Marks      : " + totalMarks);
        System.out.printf("Percentage       : %.2f%%\n", average);
        System.out.println("Grade            : " + grade);
        System.out.println("Result           : " + result);

        sc.close();
    }
}