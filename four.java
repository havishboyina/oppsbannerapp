import java.util.Scanner;

public class four {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;

        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        thirdNumber = input.nextInt();

        int resultWithoutBrackets = firstNumber + secondNumber * thirdNumber;
        int resultWithBrackets = (firstNumber + secondNumber) * thirdNumber;

        double average = (double) (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Result without brackets: " + resultWithoutBrackets);
        System.out.println("Result with brackets: " + resultWithBrackets);
        System.out.println("Average: " + average);

        input.close();
    }
}