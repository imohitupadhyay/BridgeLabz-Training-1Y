import java.util.Scanner;

public class FactorsCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if (num <= 0) { System.err.println("Invalid input."); return; }

        System.out.print("Factors (For Loop): ");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) System.out.print(i + " ");
        }

        System.out.print("\nFactors (While Loop): ");
        int counter = 1;
        while (counter < num) {
            if (num % counter == 0) System.out.print(counter + " ");
            counter++;
        }
        input.close();
    }
}