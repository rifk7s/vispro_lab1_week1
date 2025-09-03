abstract class Animal {
    abstract void bark();
}

class Dog extends Animal {
    @Override
    void bark() {
        System.out.println("Woof");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.bark();
    }
}
