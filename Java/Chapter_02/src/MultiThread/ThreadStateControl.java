package MultiThread;

import java.awt.*;

public class ThreadStateControl {
    public static void main(String[] arg) {
        JoinThread joinThread = new JoinThread();
        joinThread.start();

        try {
            joinThread.join();
        } catch (InterruptedException e) {
        }

        System.out.println(joinThread.getSum());

        YieldA yieldA = new YieldA();
        YieldB yieldB = new YieldB();
        yieldA.start();
        yieldB.start();

        try {Thread.sleep(100); } catch (InterruptedException e) {}
        yieldA.work = false;

        try {Thread.sleep(100); } catch (InterruptedException e) {}
        yieldA.work = true;

        try {Thread.sleep(100); } catch (InterruptedException e) {}
        yieldA.stop = true;
        yieldB.stop = true;
    }
}

class YieldA extends Thread {
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("Run Thread A!");
            } else {
                Thread.yield();
            }
        }
        System.out.println("Terminate Thread A");
    }
}

class YieldB extends Thread {
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("Run Thread B!");
            } else {
                Thread.yield();
            }
        }
        System.out.println("Terminate Thread B");
    }
}

class JoinThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void run() {
        for(int i=1; i<=100; i++) {
            sum += 1;
        }
    }
}