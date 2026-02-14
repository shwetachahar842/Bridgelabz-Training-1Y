import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step (a): Take input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Step (b): Convert height from cm to meter
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("Your BMI is: " + bmi);

        // Step (c): Determine weight status
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal Weight");
        } 
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } 
        else {
            System.out.println("Weight Status: Obese");
        }

        sc.close();
    }
}
