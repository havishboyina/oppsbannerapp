import java.util.Scanner;

public class six {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsiusTemperature;
        double fahrenheitTemperature;

        System.out.print("Enter temperature in Celsius: ");
        celsiusTemperature = input.nextDouble();

        fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature);

        input.close();
    }
}