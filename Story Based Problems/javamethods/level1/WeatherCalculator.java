public class WeatherCalculator {
    public double calculateWindChill(double temp, double windSpeed) {
        // Formula: 35.74 + 0.6215*T + (0.4275*T - 35.75) * V^0.16 [cite: 121]
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }
}