abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        var dog = new Dog();
        dog.sound();
    }
}