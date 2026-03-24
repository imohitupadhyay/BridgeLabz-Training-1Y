class Order implements Runnable{
    int id;
    int time;

    Order(int i,int t){
        id=i; time=t;
    }

    public void run(){
        try{
            System.out.println("Order "+id+" Picked");
            Thread.sleep(time);
            System.out.println("Order "+id+" Delivered");
        }catch(Exception e){}
    }
}

class FoodDeliverySystem{
    public static void main(String[] args){
        Thread t1=new Thread(new Order(1,2000));
        Thread t2=new Thread(new Order(2,3000));
        Thread t3=new Thread(new Order(3,1000));
        Thread t4=new Thread(new Order(4,2500));
        Thread t5=new Thread(new Order(5,1500));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(5);
        t5.setPriority(3);

        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
    }
}
