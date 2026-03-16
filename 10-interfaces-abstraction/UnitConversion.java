interface Converter {

    static double kmToMiles(double km) {
        return km * 0.621;
    }

    static double kgToLbs(double kg) {
        return kg * 2.204;
    }
}

class Main8 {
    public static void main(String[] args) {

        System.out.println("Miles: " + Converter.kmToMiles(10));
        System.out.println("Pounds: " + Converter.kgToLbs(5));
    }
}