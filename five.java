import java.util.Scanner;

public class five {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Fixed values stored as variables
        String correctUsername = "admin";
        String correctPassword = "1234";

        // User input variables
        String enteredUsername;
        String enteredPassword;

        // Taking inputs
        System.out.print("Enter username: ");
        enteredUsername = input.nextLine();

        System.out.print("Enter password: ");
        enteredPassword = input.nextLine();

        // Boolean expression with logical AND
        boolean isValidUser = enteredUsername.equals(correctUsername) 
                              && enteredPassword.equals(correctPassword);

        // Conditional statement
        if (isValidUser) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

        input.close();
    }
}