class BankUser implements Runnable {
    String name;
    int priority;

    BankUser(String n,int p){
        name=n;
        priority=p;
    }

    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(name+" checking balance | Priority: "+Thread.currentThread().getPriority());
            try{ Thread.sleep(2000); } catch(Exception e){}
        }
    }
}

class BankAccountSimulation {
    public static void main(String[] args){
        Thread t1=new Thread(new BankUser("Premium User",10));
        Thread t2=new Thread(new BankUser("Regular User",5));
        Thread t3=new Thread(new BankUser("Basic User",1));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start(); t2.start(); t3.start();
    }
}
