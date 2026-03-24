class Entry extends Thread{
    public void run(){
        System.out.println("Students entering");
    }
}

class Paper extends Thread{
    public void run(){
        try{ Thread.sleep(5000);}catch(Exception e){}
        System.out.println("Paper distributed");
    }
}

class Attendance extends Thread{
    public void run(){
        try{ Thread.sleep(10000);}catch(Exception e){}
        System.out.println("Attendance marked");
    }
}

class ExamHallSystem{
    public static void main(String[] args){
        Entry e=new Entry();
        Paper p=new Paper();
        Attendance a=new Attendance();

        e.setPriority(5);
        p.setPriority(10);
        a.setPriority(8);

        e.start(); p.start(); a.start();
    }
}
