package Class;

public class Overloading {
    public static void main(String[] agr) {
        OverloadingTest test1 = new OverloadingTest(1);
        OverloadingTest test2 = new OverloadingTest("String");
        String[] words = {"Hello", "Class.Overloading"};
        OverloadingTest test3 = new OverloadingTest(words);
    }
}

class OverloadingTest {
    OverloadingTest(int a) {
        this("Null", a);
        //System.out.println("INT: " + a);
    }
    OverloadingTest(String a) {
        this(a, 0);
        //System.out.println("STRING: " + a);
    }
    OverloadingTest(String[] a) {
        System.out.println("STRINGS: " + a);
        for (String word:a){
            System.out.print(word + " ");
        }
    }
    OverloadingTest(String a, int b) {
        System.out.println("STRING: " + a);
        System.out.println("INT: " + b);
    }
}