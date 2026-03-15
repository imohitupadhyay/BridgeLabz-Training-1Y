import java.util.Scanner;

public class MultiplicationSpecificRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); [cite: 969]
        int[] multiplicationResult = new int[4]; // Indices for 6, 7, 8, 9 [cite: 969]

        // Find results from 6 to 9 [cite: 970]
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display results [cite: 971]
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        input.close();
    }
}