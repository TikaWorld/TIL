package Exception;

public class ClassCastException {
    public static void main(String[] arg) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        Dog dog = (Dog)animal;
    }
}

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}
