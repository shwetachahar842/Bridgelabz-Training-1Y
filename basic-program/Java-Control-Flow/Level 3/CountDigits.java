import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step (a): Get integer input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step (b): Initialize count to 0
        int count = 0;

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {

            // If number is negative, convert to positive
            if (number < 0) {
                number = -number;
            }

            // Step (c): Loop until number becomes 0
            while (number != 0) {

                // Step (d): Remove last digit
                number = number / 10;

                // Step (e): Increase count
                count++;
            }
        }

        // Step (f): Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
