import java.util.Scanner;

public class NaturalSumComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = input.nextInt();

        // Validate if it is a natural number
        if (n <= 0) {
            System.err.println("Invalid Input: " + n + " is not a natural number.");
            System.exit(0);
        }

        // Calculation using Formula
        int formulaSum = n * (n + 1) / 2;

        // Calculation using While Loop
        int loopSum = 0;
        int counter = 1;
        while (counter <= n) {
            loopSum += counter;
            counter++;
        }

        // Compare and Display Result
        System.out.println("Sum using Formula: " + formulaSum);
        System.out.println("Sum using Loop: " + loopSum);
        if (formulaSum == loopSum) {
            System.out.println("Both computations are correct.");
        }
        input.close();
    }
}