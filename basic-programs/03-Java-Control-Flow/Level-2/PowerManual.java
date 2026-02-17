import java.util.Scanner;

public class PowerManual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();

        long result = 1;
        // While loop implementation
        int count = 0;
        while (count < power) {
            result *= base;
            count++;
        }

        System.out.println(base + " raised to power " + power + " is: " + result);
        input.close();
    }
}