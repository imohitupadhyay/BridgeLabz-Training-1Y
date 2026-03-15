public class HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2; // [cite: 83, 84]
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt(); // [cite: 82]
        System.out.println("Max handshakes: " + calculateHandshakes(students)); // [cite: 85]
    }
}