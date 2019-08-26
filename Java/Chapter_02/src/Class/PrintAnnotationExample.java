package Class;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] arg) {
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for(Method method : declaredMethods) {
            if(method.isAnnotationPresent(PrintAnnotation.class)) {
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                System.out.println("[" + method.getName() + "]");
                for(int i=0; i<printAnnotation.number(); i++) {
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try {
                    method.invoke(new Service());
                } catch (Exception e) {}
                System.out.println();
            }
        }
    }
}

class Service {
    @PrintAnnotation
    void method1() {
        System.out.println("Execute Class.Method 1");
    }

    @PrintAnnotation
    void method2() {
        System.out.println("Execute Class.Method 2");
    }

    @PrintAnnotation
    void method3() {
        System.out.println("Execute Class.Method 3");
    }
}
