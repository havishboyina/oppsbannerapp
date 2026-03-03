import java.util.Scanner;

public class two {
    public static void main(String[] args) {

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int limit;
        int evenCount = 0;

        // Taking input
        System.out.print("Enter limit: ");
        limit = input.nextInt();

        // For loop to check even numbers
        for (int number = 1; number <= limit; number++) {

            // Boolean expression
            boolean isEven = (number % 2 == 0);

            if (isEven) {
                evenCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);

        input.close();
    }
}