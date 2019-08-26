package Class.AccessModifierClass;

public class B {
    public A a = new A();
    public B() {
        System.out.println("Class in same Class.pakage\n");

        System.out.println("Acess Public Field: " + a.field1);
        System.out.println("Acess Default Field: " + a.field2);
        System.out.println("Acess Private Field: " + "Fail");

        System.out.print("Call in same Class.pakage: ");
        a.method1();
        System.out.print("Call in same Class.pakage: ");
        a.method2();
        System.out.println("Call in same Class.pakage: Fail Call Private Class.Method\n");
    }
}
