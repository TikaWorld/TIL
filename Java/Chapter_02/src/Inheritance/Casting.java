package Inheritance;

public class Casting {
    public static void main(String[] arg) {
        CastingA parentA = new CastingB();
        method(parentA);

        CastingA parentB = new CastingA();
        method(parentB);
    }

    public static void method(CastingA parent) {
        if(parent instanceof CastingB) {
            CastingB child = (CastingB) parent;
            System.out.println("Success Casting Class B");
        } else {
            System.out.println("Fail Casting Class B");
        }
    }
}

class CastingA {

}

class CastingB extends CastingA {

}
