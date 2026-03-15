public class FootballTeamStats {
    public static int[] generateHeights() {
        int[] heights = new int[11]; // size 11 for a football team [cite: 253]
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // Range 150-250 [cite: 253]
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h; [cite: 254]
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length; [cite: 252, 255]
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h; [cite: 256]
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h; [cite: 257]
        return max;
    }

    public static void main(String[] args) {
        int[] teamHeights = generateHeights();
        System.out.println("Mean Height: " + findMean(teamHeights));
        System.out.println("Shortest: " + findShortest(teamHeights));
        System.out.println("Tallest: " + findTallest(teamHeights));
    }
}