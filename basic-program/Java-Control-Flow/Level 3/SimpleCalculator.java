import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step (a): Declare variables
        double first, second;
        String op;

        // Step (b): Get input
        System.out.print("Enter first number: ");
        first = sc.nextDouble();

        System.out.print("Enter second number: ");
        second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();

        // Step (e): Use switch case
        switch (op) {

            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                // Step (g): Invalid operator
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
