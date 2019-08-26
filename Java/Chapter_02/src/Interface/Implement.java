package Interface;

public class Implement{
    public static void main(String[] arg) {
        Declaration inter1 = new ImplementA();
        Declaration inter2 = new Declaration() {
            @Override
            public void abstractMethod() {
                System.out.println("Call Undeclared Override Method");
            }
        };

        inter1.abstractMethod();
        inter1.defaultMethod("Call Declared default Method");
        ImplementA.classMethod();
        inter2.abstractMethod();
        inter2.defaultMethod("Call Undeclared default Method");
        Declaration.staticMethod("Call Interface Static Method");
    }
}

class ImplementA implements Declaration{
    @Override
    public void abstractMethod() {
        System.out.println("Call Declared Override Method");
    }

    @Override
    public void defaultMethod(String arg) {
        System.out.println("Call Declared Override Method");
    }

    public static void classMethod() {
        System.out.println("Call Declared Class Method");
    }
}