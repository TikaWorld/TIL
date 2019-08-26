package Exception;

public class TryCatchFinally {
    public static void main(String[] arg) {
        try {
            Class clazz = Class.forName("java.lang.String2");
        } catch(ClassNotFoundException | java.lang.NumberFormatException e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Are we got Exception");
        }

        try (FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            throw new Exception();
        } catch(Exception e) {
            System.out.println("Execute Exception Code");
        }
    }
}
