import java.util.Scanner;

public class week {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        double height;
        char grade;
        boolean isStudent;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your height (in meters): ");
        height = sc.nextDouble();

        System.out.print("Enter your grade: ");
        grade = sc.next().charAt(0);

        System.out.print("Are you a student? (true/false): ");
        isStudent = sc.nextBoolean();

        int a = 10;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        int result = 10 + 5 * 2;
        int resultWithBrackets = (10 + 5) * 2;

        double average = (double) (sum + difference + product + quotient) / 4;

        System.out.println("\n--- Output ---");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        System.out.println("Result (10 + 5 * 2): " + result);
        System.out.println("Result ((10 + 5) * 2): " + resultWithBrackets);

        System.out.println("Average after type conversion: " + average);

        sc.close();
    }
}