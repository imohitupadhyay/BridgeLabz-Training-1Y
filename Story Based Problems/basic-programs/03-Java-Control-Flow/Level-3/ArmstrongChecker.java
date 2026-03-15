import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number; // [cite: 121]
        int sum = 0;

        while (originalNumber != 0) { // [cite: 122]
            int digit = originalNumber % 10; // [cite: 123]
            sum += (digit * digit * digit);
            originalNumber /= 10; // [cite: 124]
        }

        if (sum == number) System.out.println(number + " is an Armstrong number."); // [cite: 126]
        else System.out.println(number + " is not an Armstrong number.");
        input.close();
    }
}
