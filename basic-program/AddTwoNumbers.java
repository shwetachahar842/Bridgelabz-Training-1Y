import java.util.Scanner; // Import the Scanner class

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner to free up resources
        input.close();
    }
}