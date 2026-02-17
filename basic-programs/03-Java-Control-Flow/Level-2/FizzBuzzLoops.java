import java.util.Scanner;

public class FizzBuzzLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.err.println("Please enter a positive integer.");
            return;
        }

        System.out.println("--- Using For Loop ---");
        for (int i = 1; i <= n; i++) {
            printFizzBuzz(i);
        }

        System.out.println("\n--- Using While Loop ---");
        int count = 1;
        while (count <= n) {
            printFizzBuzz(count);
            count++;
        }
        input.close();
    }

    private static void printFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) System.out.print("FizzBuzz ");
        else if (i % 3 == 0) System.out.print("Fizz ");
        else if (i % 5 == 0) System.out.print("Buzz ");
        else System.out.print(i + " ");
    }
}