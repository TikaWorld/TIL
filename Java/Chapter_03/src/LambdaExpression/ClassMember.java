package LambdaExpression;

public class ClassMember {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}

class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            VoidLambda lambda= () -> {
                System.out.println(outterField);
                System.out.println(UsingThis.this.outterField);

                System.out.println(innerField);
                System.out.println(this.innerField);
            };
            lambda.method();
        }
    }
}
