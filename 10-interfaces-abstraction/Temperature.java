import java.util.function.Predicate;

class TempAlert {
    public static void main(String[] args) {

        Predicate<Double> alert = t -> t > 40;

        double temp = 45;

        if(alert.test(temp))
            System.out.println("Temperature too high");
        else
            System.out.println("Temperature normal");
    }
}