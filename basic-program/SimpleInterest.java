import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual Rate of interest (in %): ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time period (in years): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        double totalAmount = principal + simpleInterest;

        System.out.println("\n--- Interest Calculation ---");
        System.out.printf("Principal Amount: %.2f\n", principal);
        System.out.printf("Simple Interest:  %.2f\n", simpleInterest);
        System.out.printf("Total Amount:     %.2f\n", totalAmount);

        input.close();
    }
}