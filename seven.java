import java.util.Scanner;

public class seven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String customerName;
        double itemPrice;
        int quantity;
        double totalAmount;
        double discountRate;
        double discountAmount;
        double finalAmount;

        System.out.print("Enter customer name: ");
        customerName = input.nextLine();

        System.out.print("Enter item price: ");
        itemPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        System.out.print("Enter discount percentage: ");
        discountRate = input.nextDouble();

        totalAmount = itemPrice * quantity;
        discountAmount = (totalAmount * discountRate) / 100;
        finalAmount = totalAmount - discountAmount;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Amount to Pay: " + finalAmount);

        input.close();
    }
}