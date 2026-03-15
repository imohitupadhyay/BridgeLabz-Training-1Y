import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age and height for " + friends[i] + ": ");
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        // Find youngest
        int minAge = ages[0];
        String youngest = friends[0];
        if (ages[1] < minAge) { minAge = ages[1]; youngest = friends[1]; }
        if (ages[2] < minAge) { minAge = ages[2]; youngest = friends[2]; }

        // Find tallest
        double maxHeight = heights[0];
        String tallest = friends[0];
        if (heights[1] > maxHeight) { maxHeight = heights[1]; tallest = friends[1]; }
        if (heights[2] > maxHeight) { maxHeight = heights[2]; tallest = friends[2]; }

        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);
        input.close();
    }
}