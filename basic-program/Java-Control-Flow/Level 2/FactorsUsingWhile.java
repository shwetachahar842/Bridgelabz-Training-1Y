import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {

            System.out.println("Factors of " + number + " are:");

            int counter = 1;   // Initialize counter

            while (counter < number) {

                if (number % counter == 0) {
                    System.out.println(counter);
                }

                counter++;   // Increment counter (very important)
            }
        }

        sc.close();
    }
}
