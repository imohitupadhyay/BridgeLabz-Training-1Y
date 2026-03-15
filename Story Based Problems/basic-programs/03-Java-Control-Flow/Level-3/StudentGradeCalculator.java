import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        double averageMark = (physics + chemistry + maths) / 3.0; // [cite: 104]
        String grade, remarks;

        // Grading logic based on table [cite: 102]
        if (averageMark >= 80) {
            grade = "A"; remarks = "(Level 4, above agency-normalized standards)";
        } else if (averageMark >= 70) {
            grade = "B"; remarks = "(Level 3, at agency-normalized standards)";
        } else if (averageMark >= 60) {
            grade = "C"; remarks = "(Level 2, below standards)";
        } else if (averageMark >= 50) {
            grade = "D"; remarks = "(Level 1, well below standards)";
        } else if (averageMark >= 40) {
            grade = "E"; remarks = "(Level 1-, too below standards)";
        } else {
            grade = "R"; remarks = "(Remedial standards)";
        }

        System.out.println("\nAverage Mark: " + averageMark + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        input.close();
    }
}