import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step (b): Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;   // Step (c): Initialize sum to 0

        // Step (d): Loop from 1 to number-1
        for (int i = 1; i < number; i++) {

            // Step (e): Check if i is a divisor
            if (number % i == 0) {

                // Step (f): Add divisor to sum
                sum = sum + i;
            }
        }

        // Step (g) & (h): Check if sum > number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is Not an Abundant Number");
        }

        sc.close();
    }
}
