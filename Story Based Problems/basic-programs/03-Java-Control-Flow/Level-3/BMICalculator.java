import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double heightMeters = heightCm / 100.0; // [cite: 138]
        double bmi = weight / (heightMeters * heightMeters);

        String status;
        if (bmi <= 18.4) status = "Underweight"; // [cite: 140]
        else if (bmi < 25.0) status = "Normal";
        else if (bmi < 40.0) status = "Overweight";
        else status = "Obese";

        System.out.printf("BMI: %.2f Status: %s\n", bmi, status);
        input.close();
    }
}