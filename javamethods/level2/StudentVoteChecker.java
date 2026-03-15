import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) return false; [cite: 122]
        return age >= 18; [cite: 123]
    }

    public static void main(String[] args) {
        StudentVoteChecker checker = new StudentVoteChecker();
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) { [cite: 124]
            System.out.print("Enter age for student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Can vote: " + checker.canStudentVote(ages[i]));
        }
    }
}