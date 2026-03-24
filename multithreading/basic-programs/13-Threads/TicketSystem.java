class Ticket extends Thread{
    String type;

    Ticket(String t){
        type=t;
    }

    public void run(){
        System.out.println(type+" processing by "+Thread.currentThread().getName());
        try{ Thread.sleep(2000);}catch(Exception e){}
        System.out.println(type+" completed");
    }
}

class TicketSystem{
    public static void main(String[] args){
        Ticket t1=new Ticket("Critical Bug");
        Ticket t2=new Ticket("Feature Request");
        Ticket t3=new Ticket("General Query");
        Ticket t4=new Ticket("Feedback");

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);
        t4.setPriority(1);

        t1.start(); t2.start(); t3.start(); t4.start();
    }
}
