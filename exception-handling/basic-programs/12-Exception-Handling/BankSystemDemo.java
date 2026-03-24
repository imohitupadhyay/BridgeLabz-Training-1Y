class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}

class BankAccount {
    double balance = 1000;

    void withdraw(double amt) throws InsufficientBalanceException{
        if(amt < 0)
            throw new IllegalArgumentException();
        if(amt > balance)
            throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amt;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

class BankSystemDemo {
    public static void main(String[] args){
        BankAccount b = new BankAccount();

        try{
            b.withdraw(2000);
        } catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println("Invalid amount!");
        }
    }
}
