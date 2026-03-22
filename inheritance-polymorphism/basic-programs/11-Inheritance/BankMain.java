class BankAccount {
    int accNo;
    double balance;
}

class SavingsAccount extends BankAccount {
    void displayAccountType(){
        System.out.println("Savings");
    }
}

class CheckingAccount extends BankAccount {
    void displayAccountType(){
        System.out.println("Checking");
    }
}

class FixedDepositAccount extends BankAccount {
    void displayAccountType(){
        System.out.println("FD");
    }
}
