import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int count = 0; // [cite: 130]

        // Iterate until number is 0 [cite: 131]
        while (number != 0) {
            number /= 10; // [cite: 132]
            count++; // [cite: 133]
        }

        System.out.println("Number of digits: " + count); // [cite: 134]
        input.close();
    }
}