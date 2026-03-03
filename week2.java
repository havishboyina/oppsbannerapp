import java.util.Scanner;

public class week2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter your attendance percentage: ");
        int attendance = sc.nextInt();

        boolean isPassed;
        boolean hasGoodAttendance = attendance >= 75;

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

        isPassed = (marks >= 50) && hasGoodAttendance;

        if (isPassed) {
            System.out.println("You are promoted to next class.");
        } else {
            System.out.println("You are not promoted.");
        }

        System.out.println("\nFor Loop Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Number: " + i);
        }

        System.out.println("\nWhile Loop Example:");
        int count = 1;
        while (count <= 5) {
            if (count == 4) {
                break;
            }
            System.out.println("Count: " + count);
            count++;
        }

        System.out.print("\nChoose a day number (1-3): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}