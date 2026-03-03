import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;
        int counter = 1;
        int limit = 10;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // While loop
        while (counter <= limit) {

            int result = number * counter;
            System.out.println(number + " x " + counter + " = " + result);

            counter++;
        }

        input.close();
    }
}