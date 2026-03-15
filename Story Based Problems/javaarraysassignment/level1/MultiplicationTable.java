import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); [cite: 947]
        int[] results = new int[10]; [cite: 948]

        // Store results in array [cite: 949]
        for (int i = 0; i < 10; i++) {
            results[i] = number * (i + 1);
        }

        // Display results [cite: 950]
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }
        input.close();
    }
}