import java.util.Scanner;

public class MatrixTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols]; [cite: 1002]
        int[] array1D = new int[rows * cols]; [cite: 1004]

        // Input 2D elements [cite: 1002]
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Copy to 1D array [cite: 1005, 1006]
        int index = 0;
        for (int i = 0; i < rows; i++) { [cite: 1007]
            for (int j = 0; j < cols; j++) {
                array1D[index++] = matrix[i][j];
            }
        }

        System.out.print("1D Array elements: ");
        for (int val : array1D) System.out.print(val + " ");
        input.close();
    }
}