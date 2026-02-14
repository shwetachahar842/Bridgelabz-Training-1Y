import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step (b): Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;   // store original number
        int sum = 0;                   // Step (c): initialize sum to 0

        // If number is negative, convert to positive
        if (number < 0) {
            number = -number;
        }

        // Step (d): Use while loop to access each digit
        while (number != 0) {

            // Step (e): Get last digit
            int digit = number % 10;

            // Add digit to sum
            sum = sum + digit;

            // Remove last digit
            number = number / 10;
        }

        // Step (f): Check divisibility
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number");
        }

        sc.close();
    }
}
