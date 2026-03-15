import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0, temp = number;

        while (temp != 0) { // [cite: 149]
            sum += (temp % 10); // [cite: 151]
            temp /= 10;
        }

        if (number % sum == 0) System.out.println(number + " is a Harshad Number."); // [cite: 152]
        else System.out.println(number + " is not a Harshad Number.");
        input.close();
    }
}