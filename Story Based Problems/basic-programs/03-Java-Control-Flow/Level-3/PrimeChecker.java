import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (> 1): ");
        int number = input.nextInt();
        boolean isPrime = true; // [cite: 111]

        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number-1 [cite: 109]
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // [cite: 110]
                }
            }
        }

        if (isPrime) System.out.println(number + " is a prime number.");
        else System.out.println(number + " is not a prime number.");
        input.close();
    }
}