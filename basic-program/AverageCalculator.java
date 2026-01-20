import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("\n--- Calculation Result ---");
        System.out.printf("The average of %.2f, %.2f, and %.2f is: %.2f\n", num1, num2, num3, average);

        input.close();
    }
}