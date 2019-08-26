package Exception;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] arg) {
        if (arg.length == 2) {
            String data1 = arg[0];
            String data2 = arg[1];
            System.out.println("arg[0]: " + arg[0]);
            System.out.println("arg[1]: " + arg[1]);
        } else {
            System.out.println("[Execution]");
            System.out.print("java ArrayIndexOutOfBoundsExceptionExample");
        }
    }
}
