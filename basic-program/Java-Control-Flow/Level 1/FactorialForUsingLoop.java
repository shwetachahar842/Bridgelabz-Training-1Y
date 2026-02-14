import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if number is natural
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            
            long factorial = 1;
            
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        
        sc.close();
    }
}
