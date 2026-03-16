class Job implements Runnable {

    public void run() {
        System.out.println("Background job running...");
    }

    public static void main(String[] args) {

        Job j = new Job();

        Thread t = new Thread(j);
        t.start();
    }
}