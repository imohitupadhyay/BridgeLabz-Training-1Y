import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Define an array of 10 integer elements [cite: 935]
        int[] ages = new int[10];

        // Take user input for ages [cite: 935]
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Loop through the array using length property [cite: 936]
        for (int i = 0; i < ages.length; i++) {
            // Validate if age is negative [cite: 936]
            if (ages[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote."); [cite: 936]
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote."); [cite: 937]
            }
        }
        input.close();
    }
}