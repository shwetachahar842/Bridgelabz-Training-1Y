import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("\n--- Rectangle Dimensions ---");
        System.out.println("Length:    " + length);
        System.out.println("Width:     " + width);
        System.out.println("Perimeter: " + perimeter);

        input.close();
    }
}