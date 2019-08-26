package Class;

public class ClassField {
    public static void main(String[] arg) {
        FieldTest test = new FieldTest("Change");
        System.out.println(test.var1);
        System.out.println(test.var2);
    }
}

class FieldTest {
    String var1 = "Not Change without this";
    String var2 = "Not Change with this";

    FieldTest(String a) {
        String var1;
        String var2;
        var1 = a + " " + "without this";
        this.var2 = a + " " + "with this";
    }
}