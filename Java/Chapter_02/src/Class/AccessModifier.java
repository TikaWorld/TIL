package Class;

import Class.AccessModifierClass.B;

public class AccessModifier {
    public static void main(String[] arg) {
        B b = new B();

        System.out.println("Class in different Class.pakage\n");

        System.out.println("Acess Public Field: " + b.a.field1);
        System.out.println("Acess Default Field: " + "Fail");
        System.out.println("Acess Private Field: " + "Fail");

        System.out.print("Call in same Class.pakage: ");
        b.a.method1();
        System.out.println("Call in different Class.pakage: Fail Call Default Class.Method");
        System.out.println("Call in different Class.pakage: Fail Call Private Class.Method\n");
    }
}
