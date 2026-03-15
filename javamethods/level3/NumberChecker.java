public class NumberChecker {
    // Count digits in a number [cite: 262]
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Store digits in an array [cite: 263]
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Duck Number: Contains a non-zero digit [cite: 264-265]
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    // Armstrong Number: Sum of digits raised to power of count [cite: 266-267]
    public static boolean isArmstrong(int number) {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return (int) sum == number;
    }

    // Find largest and second largest [cite: 269]
    public static int[] findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }
}