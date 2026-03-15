public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "Racecar";
        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Handle nulls and convert to lowercase for case-insensitivity
        if (str == null) return false;
        
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        return true; // No mismatches found
    }
}