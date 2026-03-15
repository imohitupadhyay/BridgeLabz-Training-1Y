import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        
        double avg = (n1 + n2 + n3) / 3;
        System.out.println("The average is: " + avg);
    }
}