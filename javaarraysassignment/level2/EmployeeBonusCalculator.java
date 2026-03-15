import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployees = 10;
        double[] oldSalaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];
        double[] bonuses = new double[numEmployees];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Input loop with validation
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter data for employee " + (i + 1) + ":");
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            System.out.print("Years of Service: ");
            double years = input.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to re-enter data [cite: 1666]
                continue;
            }
            oldSalaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculation loop
        for (int i = 0; i < numEmployees; i++) {
            // 5% bonus for > 5 years, else 2% [cite: 1661]
            double bonusPercent = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = oldSalaries[i] * bonusPercent;
            newSalaries[i] = oldSalaries[i] + bonuses[i];

            totalOldSalary += oldSalaries[i];
            totalNewSalary += newSalaries[i];
            totalBonus += bonuses[i];
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        input.close();
    }
}