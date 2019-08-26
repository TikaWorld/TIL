package LambdaExpression;

public class TargetType {
    public static void main(String[] args) {
        Lambda lambda;

        lambda = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(lambda.method(2, 5));

        lambda = (x, y) -> { return x + y; };
        System.out.println(lambda.method(2, 5));

        lambda = (x, y) -> x + y;
        System.out.println(lambda.method(2, 5));

        lambda = (x, y) -> sum(x, y);
        System.out.println(lambda.method(2, 5));
    }

    static int sum(int x, int y) {
        return (x + y);
    }
}

@FunctionalInterface
interface Lambda {
    public int method(int x, int y);
}