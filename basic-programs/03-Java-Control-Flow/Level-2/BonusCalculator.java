import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter Years of Service: ");
        int years = input.nextInt();

        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
            System.out.println("Congratulations! Your bonus is: " + bonus);
        } else {
            System.out.println("No bonus awarded (service less than 5 years).");
        }
        input.close();
    }
}