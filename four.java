import java.util.Scanner;

public class four {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int dayNumber;

        // Taking user input
        System.out.print("Enter day number (1-7): ");
        dayNumber = input.nextInt();

        // Switch statement
        switch (dayNumber) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number");
        }

        input.close();
    }
}