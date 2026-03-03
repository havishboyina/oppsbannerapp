import java.util.Scanner;

public class five {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceFromToVia;
        double distanceViaToFinalCity;
        double totalDistance;

        System.out.print("Enter distance from start to via city: ");
        distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from via city to final city: ");
        distanceViaToFinalCity = input.nextDouble();

        totalDistance = distanceFromToVia + distanceViaToFinalCity;

        System.out.println("Total Distance Travelled: " + totalDistance);

        input.close();
    }
}