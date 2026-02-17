import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11]; [cite: 975]
        double sum = 0.0; [cite: 976]

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i]; [cite: 976]
        }

        double mean = sum / heights.length; [cite: 974, 977]
        System.out.println("The mean height of the team is: " + mean); [cite: 977]
        input.close();
    }
}