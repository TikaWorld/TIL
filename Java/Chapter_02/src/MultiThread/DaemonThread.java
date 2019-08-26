package MultiThread;

public class DaemonThread {
    public static void main(String[] arg) {
        Daemon daemon = new Daemon();
        daemon.setDaemon(true);
        daemon.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        System.out.println("Terminate main Thread");
    }
}

class Daemon extends Thread {
    public void save() {
        System.out.println("Run Daemon Thread");
    }

    @Override
    public void run() {
        while(true) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}