public class SimpleInterest {
    // Method to calculate simple interest [cite: 75]
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100; // [cite: 73]
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Principal, Rate, and Time: ");
        double p = sc.nextDouble(); // [cite: 74]
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double interest = calculateSI(p, r, t);
        System.out.println("The Simple Interest is " + interest + " for Principal " + p + ", Rate " + r + " and Time " + t); // [cite: 77, 78, 79]
    }
}