import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); [cite: 989]

        int maxFactor = 10; [cite: 991]
        int[] factors = new int[maxFactor]; [cite: 991]
        int index = 0;

        for (int i = 1; i <= number; i++) { [cite: 992]
            if (number % i == 0) {
                // Resize if index hits current capacity [cite: 993, 994]
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i; [cite: 992]
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) System.out.print(factors[i] + " "); [cite: 995]
        input.close();
    }
}