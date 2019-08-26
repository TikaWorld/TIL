package Interface;

public interface Declaration {
    public int VAR1 =1;
    public int VAR2 =VAR1;

    public void abstractMethod();

    default void defaultMethod(String arg) {
        System.out.println(arg);
    }

    static void staticMethod(String arg) {
        System.out.println(arg);
    }
}
