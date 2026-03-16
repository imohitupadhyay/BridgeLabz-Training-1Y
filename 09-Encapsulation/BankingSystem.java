abstract class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int a,String h,double b){
        accountNumber=a;
        holderName=h;
        balance=b;
    }

    void deposit(double a){
        balance+=a;
    }

    void withdraw(double a){
        if(balance>=a)
            balance-=a;
    }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
}

class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(int a,String h,double b){
        super(a,h,b);
    }

    double calculateInterest(){
        return balance*0.05;
    }

    public void applyForLoan(){
        System.out.println("Loan Applied");
    }
}

class Main4 {
    public static void main(String[] args) {

        SavingsAccount s=new SavingsAccount(101,"Rohit",10000);

        s.deposit(2000);
        System.out.println("Interest: "+s.calculateInterest());
        s.applyForLoan();
    }
}