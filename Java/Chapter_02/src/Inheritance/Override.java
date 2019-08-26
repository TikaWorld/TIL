package Inheritance;

public class Override {
    public static void main(String[] arg) {
        int r = 10;

        Parent_Override parent = new Parent_Override();
        Child_Override child = new Child_Override();
        System.out.println(parent.areaCricle(r));
        System.out.println(child.areaCricle(r));
    }
}

class Parent_Override {
    double areaCricle(double r) {
        System.out.println("Parent Method");
        return 3.14159 * r * r;
    }
}

final class Child_Override extends Parent_Override {
    @java.lang.Override
    final double areaCricle(double r) {
        System.out.println("Call super Method in Child Method");
        System.out.println(super.areaCricle(r));
        System.out.println("Override Method");
        return Math.PI * r * r;
    }
}