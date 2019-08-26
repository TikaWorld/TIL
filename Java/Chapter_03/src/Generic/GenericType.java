package Generic;

public class GenericType {
    public static void main(String[] arg) {
        GenericA<String> str1 = new GenericA<String>();
        str1.set("hello");

        GenericA<Integer> var1 = new GenericA<Integer>();
        var1.set(6);

        System.out.println(str1.get() + var1.get());
    }
}

class GenericA<T> {
    private T t;
    public T get() {return t;}
    public void set(T t) {this.t = t;}
}