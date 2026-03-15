import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Not a positive number.");
            System.exit(0);
        }

        String[] results = new String[number + 1]; [cite: 1012]

        for (int i = 0; i <= number; i++) { [cite: 1008]
            if (i == 0) results[i] = "0";
            else if (i % 3 == 0 && i % 5 == 0) results[i] = "FizzBuzz";
            else if (i % 3 == 0) results[i] = "Fizz";
            else if (i % 5 == 0) results[i] = "Buzz";
            else results[i] = String.valueOf(i);
        }

        // Display results based on position [cite: 1009, 1013]
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        input.close();
    }
}