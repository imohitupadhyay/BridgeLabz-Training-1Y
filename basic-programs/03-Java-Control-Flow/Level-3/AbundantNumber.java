import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) { // [cite: 163]
            if (number % i == 0) { // [cite: 165]
                sumOfDivisors += i; // [cite: 167]
            }
        }

        if (sumOfDivisors > number) System.out.println("Abundant Number"); // [cite: 169]
        else System.out.println("Not an Abundant Number");
        input.close();
    }
}