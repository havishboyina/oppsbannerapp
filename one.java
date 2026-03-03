import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable declarations
        int marks;
        int attendancePercentage;
        boolean hasMinimumAttendance;
        boolean isPassed;

        // Taking user inputs
        System.out.print("Enter student marks: ");
        marks = input.nextInt();

        System.out.print("Enter attendance percentage: ");
        attendancePercentage = input.nextInt();

        // Boolean expressions
        hasMinimumAttendance = attendancePercentage >= 75;
        isPassed = (marks >= 50) && hasMinimumAttendance;

        // if-else if-else conditional statement
        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 75) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 50) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Grade: Fail");
        }

        // Logical operator usage
        if (isPassed) {
            System.out.println("Student is promoted.");
        } else {
            System.out.println("Student is not promoted.");
        }

        input.close();
    }
}