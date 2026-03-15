public class UnitConverter {
    // Length Conversions [cite: 94-98, 105-109]
    public static double kmToMiles(double km) { return km * 0.621371; }
    public static double milesToKm(double miles) { return miles * 1.60934; }
    public static double metersToFeet(double m) { return m * 3.28084; }
    public static double feetToMeters(double ft) { return ft * 0.3048; }
    public static double yardsToFeet(double y) { return y * 3; }
    public static double feetToYards(double ft) { return ft / 3; } // Note: Source 106 says 8.33 but logic is /3
    public static double metersToInches(double m) { return m * 39.3701; }
    public static double inchesToMeters(double in) { return in * 0.0254; }

    // Temperature [cite: 112, 114]
    public static double fahrenheitToCelsius(double f) { return (f - 32) * 5/9; }
    public static double celsiusToFahrenheit(double c) { return (c * 9/5) + 32; }

    // Weight and Volume [cite: 115-118]
    public static double poundsToKg(double lbs) { return lbs * 0.453592; }
    public static double kgToPounds(double kg) { return kg * 2.20462; }
    public static double gallonsToLiters(double gal) { return gal * 3.78541; }
    public static double litersToGallons(double l) { return l * 0.264172; }
}