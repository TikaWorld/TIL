package Inheritance;

import Inheritance.ProtectedClass.ProtectedA;

public class Protected {
    public static void main(String[] arg) {
        ProtectedB b = new ProtectedB();
    }
}

class ProtectedB extends ProtectedA {
    public ProtectedB() {
        System.out.println("Init Child Class!\n");
        this.field = "value";
        this.method();
    }
}