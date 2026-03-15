import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        // Must be >= 1582 and (divisible by 4 AND not 100) OR divisible by 400 [cite: 89, 90]
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Is Leap Year: " + isLeapYear(year));
    }
}