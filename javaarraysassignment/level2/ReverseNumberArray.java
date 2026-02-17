import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find digit count
        int temp = number, count = 0;
        while(temp != 0) { count++; temp /= 10; }

        int[] digits = new int[count];
        int[] reversed = new int[count];

        // Store digits
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Reverse into new array [cite: 1705]
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }

        System.out.print("Reversed number: ");
        for (int val : reversed) System.out.print(val);
        input.close();
    }
}