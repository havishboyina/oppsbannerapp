import java.util.Scanner;

public class three {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double length;
        double width;
        double area;
        double perimeter;

        System.out.print("Enter length of rectangle: ");
        length = input.nextDouble();

        System.out.print("Enter width of rectangle: ");
        width = input.nextDouble();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        input.close();
    }
}