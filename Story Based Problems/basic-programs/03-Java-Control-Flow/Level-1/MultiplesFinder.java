import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (positive and < 100): ");
        int number = input.nextInt();

        // Validate number
        if (number <= 0 || number >= 100) {
            System.err.println("Please enter a positive integer less than 100.");
            System.exit(0);
        }

        System.out.println("Multiples of " + number + " below 100 are:");
        // Start counter just below 100
        int counter = 99;
        while (counter >= 1) {
            if (counter % number == 0) {
                System.out.print(counter + " ");
            }
            counter--;
        }
        input.close();
    }
}