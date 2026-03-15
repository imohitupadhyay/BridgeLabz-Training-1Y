public class MinMaxFinder {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3)); // [cite: 101]
        int largest = Math.max(n1, Math.max(n2, n3)); // [cite: 101]
        return new int[]{smallest, largest}; // [cite: 106]
    }
}