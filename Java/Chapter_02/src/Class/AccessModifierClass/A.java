package Class.AccessModifierClass;

public class A {
    public int field1;
    int field2;
    private int field3;

    public A() {
        System.out.println("Class in same Class\n");

        field1 = 1;
        field2 = 1;
        field3 = 1;

        System.out.println("Acess Public Field: " + field1);
        System.out.println("Acess Default Field: " + field2);
        System.out.println("Acess Private Field: " + field3);

        System.out.print("Call in same Class: ");
        method1();
        System.out.print("Call in same Class: ");
        method2();
        System.out.print("Call in same Class: ");
        method3();
    }

    public void method1() {System.out.println("Call Public Class.Method!");}
    void method2() {System.out.println("Call Default Class.Method!");}
    private void method3() {System.out.println("Call Private Class.Method!\n");}
}

