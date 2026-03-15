import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        // 2D array: [row][0]=Height, [row][1]=Weight, [row][2]=BMI [cite: 1728]
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][1] = input.nextDouble();
            System.out.print("Height (m): ");
            personData[i][0] = input.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--; continue;
            }

            // BMI = weight / (height * height)
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine Status [cite: 1717]
            if (personData[i][2] <= 18.4) status[i] = "Underweight";
            else if (personData[i][2] <= 24.9) status[i] = "Normal";
            else if (personData[i][2] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nHeight | Weight | BMI | Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f | %.2f | %.2f | %s\n",
                    personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
        input.close();
    }
}