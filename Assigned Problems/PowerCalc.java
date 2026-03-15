import java.util.Scanner;

class PowerCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        
        // We use Math.pow(base, exponent) for this
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }
}