public class LogAggregator {
    // StringBuffer is thread-safe (synchronized) [cite: 249, 252]
    private static StringBuffer sharedLog = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {
        Thread webService = new Thread(new LoggerTask("Web Server", 3));
        Thread dbService = new Thread(new LoggerTask("Database", 3));
        Thread apiService = new Thread(new LoggerTask("API Gateway", 3));

        webService.start();
        dbService.start();
        apiService.start();

        webService.join();
        dbService.join();
        apiService.join();

        System.out.println("Aggregated Logs:\n" + sharedLog.toString());
        System.out.println("Total Log Size: " + sharedLog.length() + " characters"); [cite: 302]
    }

    static class LoggerTask implements Runnable {
        private String name;
        private int entries;

        LoggerTask(String name, int entries) {
            this.name = name;
            this.entries = entries;
        }

        @Override
        public void run() {
            for (int i = 1; i <= entries; i++) {
                // Synchronized access to the buffer [cite: 258]
                sharedLog.append("[").append(System.currentTimeMillis())
                        .append("] ").append(name).append(": Entry ")
                        .append(i).append("\n");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        }
    }
}