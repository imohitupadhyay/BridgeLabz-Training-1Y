import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        double result = 0;
        boolean valid = true;

        // Using switch to determine the operation
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.err.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.err.println("Invalid Operator.");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
        input.close();
    }
}