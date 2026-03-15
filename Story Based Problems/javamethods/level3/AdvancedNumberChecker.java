public class AdvancedNumberChecker {
    // Prime Number [cite: 297-298]
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Neon Number: Sum of digits of square equals the number [cite: 299-300]
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    // Spy Number: Sum of digits equals product of digits [cite: 301-302]
    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Automorphic Number: Square ends with the number itself [cite: 303-304]
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    // Buzz Number: Divisible by 7 or ends with 7 [cite: 305-306]
    public static boolean isBuzz(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    }
}