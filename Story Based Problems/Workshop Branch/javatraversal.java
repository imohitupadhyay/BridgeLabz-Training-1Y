import java.util.Arrays;

public class javatraversal {
    public static void main(String[] args) {
        // Sample 1D Array
        int[] numbers = {10, 25, 30, 45, 50};

        System.out.println("--- 1D ARRAY TRAVERSAL ---");

        // 1. Classic for loop (Index-based)
        System.out.print("Classic For Loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 2. Enhanced for loop (Value-based)
        System.out.print("\nEnhanced For Loop: ");
        for (int val : numbers) {
            System.out.print(val + " ");
        }

        // 3. Streams (Functional approach)
        System.out.print("\nStream API: ");
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

        System.out.println("\n\n--- 2D ARRAY (MATRIX) TRAVERSAL ---");

        // Sample 2D Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Traversing rows and columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // New line after each row
        }
    }
}