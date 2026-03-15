import java.util.Scanner;

public class NaturalSum {
    // Method using recursion [cite: 85]
    public static int recursiveSum(int n) {
        if (n <= 1) return n;
        return n + recursiveSum(n - 1);
    }

    // Method using formula [cite: 86]
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) { [cite: 84]
            int res1 = recursiveSum(n);
            int res2 = formulaSum(n);
            System.out.println("Recursive Result: " + res1);
            System.out.println("Formula Result: " + res2);
            System.out.println("Results Match: " + (res1 == res2)); [cite: 87]
        } else {
            System.out.println("Not a natural number.");
        }
    }
}