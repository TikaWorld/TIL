package Class;

public class Method {
    public static void main(String[] agr) {
        MethodTest test = new MethodTest("Create!");
        MethodTest newTest = test.ReturnClass();
        System.out.println(test.sum(1, 2, 3, 4, 5));
    }

}

class MethodTest {
    MethodTest ReturnClass() {
        return new MethodTest("Is Return?");
    }

    int sum(int ... values) {
        int result = 0;
        System.out.println(values);
        for(int value: values){
            result = result + value;
        }
        return result;
    }

    MethodTest(String a) {
        System.out.println("STRING: " + a);
    }
}