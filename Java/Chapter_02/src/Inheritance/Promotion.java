package Inheritance;

public class Promotion {
    public static void main(String[] arg) {
        PromotionB b = new PromotionB();
        PromotionC c = new PromotionC();
        PromotionD d = new PromotionD();
        PromotionE e = new PromotionE();

        PromotionA a1 = b;
        PromotionA a2 = c;
        PromotionA a3 = d;
        PromotionA a4 = e;

        PromotionA[] a = {
                new PromotionB(),
                new PromotionC(),
                new PromotionD(),
                new PromotionE()
        };

        a1.Method1();
        a1.Method2();

        for(PromotionA child : a) {
            child.Method1();
            child.Method2();
            PromotionA.Method3(child);
        }

        PromotionB b1 = d;
        PromotionC c1 = e;
    }
}

class PromotionA {
    void Method1() {
        System.out.println("Call PromotionA Method1");
    }

    void Method2() {
        System.out.println("Call PromotionA Method2");
    }

    static void Method3(PromotionA promotion) {
        System.out.println(promotion);
    }
}

class PromotionB extends PromotionA {
    @java.lang.Override
    void Method2() {
        System.out.println("Call PromotionB Method2");
    }
}
class PromotionC extends PromotionA {}

class PromotionD extends PromotionB {}
class PromotionE extends PromotionC {}