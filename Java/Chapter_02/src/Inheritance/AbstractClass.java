package Inheritance;

public class AbstractClass {
    public static void main(String[] arg) {
        AbstractClassA classA = new AbstractClassC();
        AbstractClassB classB = new AbstractClassC();
        AbstractClassC classC = new AbstractClassC();

        AbstractClassA Aa = classA;
        AbstractClassA Ab = classB;
        AbstractClassA Ac = classC;

        //AbstractClassB Ba = classA;
        AbstractClassB Bb = classB;
        AbstractClassB Bc = classC;

        //AbstractClassC Ca = classA;
        //AbstractClassC Cb = classB;
        AbstractClassC Cc = classC;
    }
}

abstract class AbstractClassA {
    public abstract void methodA();
}

abstract class AbstractClassB extends AbstractClassA {
    public abstract void methodB();
}

class AbstractClassC extends AbstractClassB {
    @java.lang.Override
    public void methodA() {

    }
    @java.lang.Override
    public void methodB() {

    }
}