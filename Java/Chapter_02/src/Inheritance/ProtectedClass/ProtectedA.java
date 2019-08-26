package Inheritance.ProtectedClass;

public class ProtectedA {
    protected String field;

    protected ProtectedA() {
        System.out.println("Init Parent Class!\n");
    }

    protected void method() {
        System.out.println("Call Parent Class Method!\n");
    }
}
