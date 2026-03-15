import java.util.Scanner;

public class FriendsAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        int youngestIdx = 0;
        int tallestIdx = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIdx]) youngestIdx = i;
            if (heights[i] > heights[tallestIdx]) tallestIdx = i;
        }

        System.out.println("Youngest Friend: " + names[youngestIdx]);
        System.out.println("Tallest Friend: " + names[tallestIdx]);
        input.close();
    }
}