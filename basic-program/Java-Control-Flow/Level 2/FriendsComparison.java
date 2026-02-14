import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking age input
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Taking height input
        System.out.print("Enter height of Amar: ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter height of Akbar: ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter height of Anthony: ");
        double heightAnthony = sc.nextDouble();

        // Finding youngest
        String youngest = "";
        int minAge = ageAmar;

        youngest = "Amar";

        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }

        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }

        // Finding tallest
        String tallest = "";
        double maxHeight = heightAmar;

        tallest = "Amar";

        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }

        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }

        System.out.println("Youngest friend is: " + youngest);
        System.out.println("Tallest friend is: " + tallest);

        sc.close();
    }
}
