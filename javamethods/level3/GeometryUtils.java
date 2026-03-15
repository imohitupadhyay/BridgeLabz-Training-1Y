public class GeometryUtils {
    // Euclidean Distance [cite: 410]
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); [cite: 410]
    }

    // Line Equation: y = mx + b [cite: 411-412]
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); [cite: 414]
        double b = y1 - m * x1; [cite: 416]
        return new double[]{m, b}; // returns [slope, y-intercept] [cite: 417]
    }
}