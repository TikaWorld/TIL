package MultiThread;

public class Syncronized {
    public static void main(String[] arg) {
        ShareMemory shareMemory = new ShareMemory();
        User1 user1 = new User1();
        user1.setShareMemory(shareMemory);
        user1.start();

        User2 user2 = new User2();
        user2.setShareMemory(shareMemory);
        user2.start();
    }
}

class ShareMemory{
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}

class User1 extends Thread {
    private ShareMemory shareMemory;

    public void setShareMemory(ShareMemory shareMemory) {
        this.setName("User1");
        this.shareMemory = shareMemory;
    }

    public void run() {
        shareMemory.setMemory(100);
    }
}

class User2 extends Thread {
    private ShareMemory shareMemory;

    public void setShareMemory(ShareMemory shareMemory) {
        this.setName("User2");
        this.shareMemory = shareMemory;
    }

    public void run() {
        shareMemory.setMemory(50);
    }
}