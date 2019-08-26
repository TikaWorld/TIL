package MultiThread;

public class Priority {
    public static void main(String[] arg) {
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Run 1 Thread!");
                    try {Thread.sleep(100);}
                    catch (Exception e) {}
                }
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Run 2 Thread!");
                    try {Thread.sleep(100);}
                    catch (Exception e) {}
                }
            }
        };

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
