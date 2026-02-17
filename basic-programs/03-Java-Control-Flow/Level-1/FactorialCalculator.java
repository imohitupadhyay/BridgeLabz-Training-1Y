import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate positive integer
        if (number < 0) {
            System.err.println("Factorial is not defined for negative numbers.");
            System.exit(0);
        }

        long factorial = 1;
        // Compute factorial using for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        input.close();
    }
}