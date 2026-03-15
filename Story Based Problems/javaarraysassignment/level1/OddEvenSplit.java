import java.util.Scanner;

public class OddEvenSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check for Natural Number [cite: 981]
        if (number <= 0) {
            System.err.println("Invalid input. Not a natural number."); [cite: 982]
            System.exit(0);
        }

        int[] evenArr = new int[number / 2 + 1]; [cite: 983]
        int[] oddArr = new int[number / 2 + 1]; [cite: 983]
        int evenIndex = 0, oddIndex = 0; [cite: 984]

        for (int i = 1; i <= number; i++) { [cite: 985]
            if (i % 2 == 0) {
                evenArr[evenIndex++] = i;
            } else {
                oddArr[oddIndex++] = i;
            }
        }

        // Print results [cite: 986]
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evenArr[i] + " ");

        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(oddArr[i] + " ");
        input.close();
    }
}