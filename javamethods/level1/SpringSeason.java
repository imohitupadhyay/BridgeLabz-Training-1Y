public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20)) {
            return true; // [cite: 95]
        }
        return false;
    }
}