import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

      
        if (n > 0) {

            int sumWhile = 0;
            int i = 1;

            while (i <= n) {
                sumWhile += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            
            if (sumWhile == sumFormula) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }

        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        sc.close();
    }
}
