interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refunded: " + amount);
    }
}

class PayPal implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paid via PayPal: " + amount);
    }
}

class Main9 {
    public static void main(String[] args) {

        PayPal p = new PayPal();

        p.pay(1000);
        p.refund(200);
    }
}