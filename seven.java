import java.util.Scanner;

public class seven {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Fixed balance stored as variable
        double accountBalance = 10000.0;

        // User input variable
        double withdrawalAmount;

        // Taking withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        withdrawalAmount = input.nextDouble();

        // Boolean expressions
        boolean isSufficientBalance = withdrawalAmount <= accountBalance;
        boolean isValidAmount = withdrawalAmount > 0;

        // Conditional logic
        if (isValidAmount && isSufficientBalance) {

            accountBalance = accountBalance - withdrawalAmount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + accountBalance);

        } else if (!isValidAmount) {

            System.out.println("Invalid withdrawal amount.");

        } else {

            System.out.println("Insufficient balance.");
        }

        input.close();
    }
}

