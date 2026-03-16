import java.util.function.Function;

class StringCheck {
    public static void main(String[] args) {

        Function<String,Integer> length = s -> s.length();

        String msg = "Hello Java";

        System.out.println("Length: " + length.apply(msg));
    }
}