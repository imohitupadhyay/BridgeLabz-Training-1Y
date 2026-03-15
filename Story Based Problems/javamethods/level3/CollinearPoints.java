public class CollinearPoints {
    // Using Slope Formula [cite: 383-387]
    public static boolean checkCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1); [cite: 385]
        double slopeBC = (y3 - y2) / (x3 - x2); [cite: 385]
        double slopeAC = (y3 - y1) / (x3 - x1); [cite: 386]
        return slopeAB == slopeBC && slopeBC == slopeAC; [cite: 387]
    }

    // Using Area of Triangle Formula [cite: 388-393]
    public static boolean checkCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Area formula: 0.5 * |x1(y2-y3) + x2(y3-y1) + x3(y1-y2)| [cite: 393]
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; [cite: 389]
    }

    public static void main(String[] args) {
        // Sample points A(2,4), B(4,6), C(6,8) [cite: 381]
        boolean result = checkCollinearByArea(2, 4, 4, 6, 6, 8);
        System.out.println("Are points collinear? " + result);
    }
}