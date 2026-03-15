import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5]; [cite: 941]

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop and check number status [cite: 942]
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) System.out.println(num + " is positive and even."); [cite: 942]
                else System.out.println(num + " is positive and odd."); [cite: 942]
            } else if (num < 0) {
                System.out.println(num + " is negative."); [cite: 943]
            } else {
                System.out.println("Number is zero."); [cite: 943]
            }
        }

        // Compare first and last elements [cite: 944]
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than last.");
        } else {
            System.out.println("First element is less than last.");
        }
        input.close();
    }
}