package Inheritance;

public class Super {
    public static void main(String[] arg) {
        Parent parent = new Parent("Test");
        System.out.println(Parent.name1);
        Child child = new Child("test");
        System.out.println(Parent.name1);
        System.out.println(Child.name1);
        System.out.println(parent.name2);
        System.out.println(child.name2);
    }
}

class Parent {
    static String name1;
    public String name2;

    Parent(String name) {
        Parent.name1 = name;
        this.name2 = name;
    }
}

final class Child extends Parent {
    Child(String name) {
        super(name);
    }
}