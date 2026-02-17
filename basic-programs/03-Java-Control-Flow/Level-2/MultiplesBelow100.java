import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (positive and < 100): ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.err.println("Invalid range.");
            return;
        }

        System.out.print("Multiples below 100: ");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}