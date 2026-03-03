import java.util.Scanner;

public class three {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int limit;

        // Taking input
        System.out.print("Enter a limit: ");
        limit = input.nextInt();

        // For loop with continue and break
        for (int number = 1; number <= limit; number++) {

            // Skip number 3 using continue
            if (number == 3) {
                continue;
            }

            // Stop loop at number 7 using break
            if (number == 7) {
                break;
            }

            System.out.println("Number: " + number);
        }

        input.close();
    }
}