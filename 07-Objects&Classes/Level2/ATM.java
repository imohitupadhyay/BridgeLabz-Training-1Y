class BankAccount {
    String holder;
    int accNo;
    double balance;

    void deposit(double a) {
        balance = balance + a;
    }

    void withdraw(double a) {
        if(balance >= a)
            balance = balance - a;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Account Holder: " + holder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.holder = "Rohit";
        b.accNo = 1001;
        b.balance = 5000;

        b.deposit(2000);
        b.withdraw(1500);

        b.display();
    }
}