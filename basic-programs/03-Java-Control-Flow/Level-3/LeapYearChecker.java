import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Validate year for Gregorian calendar
        if (year < 1582) {
            System.err.println("Invalid input. Leap year calculation starts from 1582.");
            return;
        }

        // Single if condition using logical operators [cite: 99]
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        input.close();
    }
}