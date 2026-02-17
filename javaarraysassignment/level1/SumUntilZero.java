import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; [cite: 954]
        double total = 0.0; [cite: 954]
        int index = 0; [cite: 955]

        while (true) { [cite: 956]
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble(); [cite: 957]

            // Break condition: 0, negative, or max capacity [cite: 957, 958]
            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num; [cite: 960]
            index++; [cite: 960]
        }

        // Calculate total [cite: 961]
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Total sum: " + total); [cite: 962]
        input.close();
    }
}