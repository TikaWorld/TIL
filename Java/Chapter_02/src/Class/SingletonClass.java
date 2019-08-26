package Class;

public class SingletonClass {
    public static void main(String[] arg) {
        SingletonTest obj1 = SingletonTest.getInstance();
        SingletonTest obj2 = SingletonTest.getInstance();

        if(obj1 == obj2) {
            System.out.println("Singleton Same Memory location");
        } else {
            System.out.println("It's Different Class Object!");
        }
    }
}

class SingletonTest {
    private static SingletonTest singleton = new SingletonTest();

    private SingletonTest() {}

    static SingletonTest getInstance() {
        return singleton;
    }
}
