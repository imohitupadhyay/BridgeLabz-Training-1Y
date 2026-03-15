import java.util.Scanner;

public class OddEvenRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Validate for natural number
        if (number <= 0) {
            System.err.println("Error: " + number + " is not a natural number.");
            System.exit(0);
        }

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        input.close();
    }
}