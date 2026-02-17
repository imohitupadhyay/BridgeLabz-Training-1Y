import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // [student][0]=Physics, [1]=Chemistry, [2]=Maths [cite: 1744]
        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextDouble();
                if (marks[i][j] < 0) {
                    System.out.println("Negative marks invalid. Re-enter.");
                    j--;
                }
            }

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            // Grade logic [cite: 1736]
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " Percentage: " + percentages[i] + "% Grade: " + grades[i]);
        }
        input.close();
    }
}