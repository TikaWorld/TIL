package MultiThread;

public class CreateThread {
    public static void main(String[] arg) {
        Runnable task = new Task();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Run Anonymous Thread!");
                    try {Thread.sleep(100);}
                    catch (Exception e) {}
                }
            }
        };
        System.out.println(thread1.getName());
        thread1.start();
        System.out.println(thread2.getName());
        thread2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Run Main Thread!");
            try { Thread.sleep(100); }
            catch(Exception e){}
        }
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Run Task Thread!");
            try { Thread.sleep(100); }
            catch(Exception e){}
        }
    }
}