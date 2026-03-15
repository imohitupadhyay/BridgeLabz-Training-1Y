import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Validate positive power
        if (power < 0) {
            System.err.println("This program only handles positive powers.");
            System.exit(0);
        }

        long result = 1;
        // Compute power: base multiplied by itself 'power' times
        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power of " + power + " is: " + result);
        input.close();
    }
}