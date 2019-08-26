package Class;

public class FinalField {
    public static void main(String[] arg) {
        FinalFieldTest test = new FinalFieldTest();
        System.out.println(test.var);
        System.out.println(FinalFieldTest.PI);
    }
}

class FinalFieldTest {
    final int var = 1;
    static final double PI = 3.14;
}
