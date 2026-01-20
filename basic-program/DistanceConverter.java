import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double MILES_PER_KILOMETER = 0.621371;

        System.out.print("Enter distance in Kilometers: ");
        double kilometers = input.nextDouble();

        double miles = kilometers * MILES_PER_KILOMETER;

        System.out.println("\n--- Conversion Results ---");
        System.out.println(kilometers + " Kilometers is approximately:");
        System.out.printf("%.4f Miles\n", miles);

        input.close();
    }
}