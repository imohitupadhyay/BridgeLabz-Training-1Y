public class AthleteRun {
    public static double computeRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3; // [cite: 90]
        return 5000 / perimeter; // 5km = 5000m [cite: 90, 91]
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter 3 sides of triangle (meters): ");
        double a = sc.nextDouble(); // [cite: 89]
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Total rounds needed: " + computeRounds(a, b, c));
    }
}