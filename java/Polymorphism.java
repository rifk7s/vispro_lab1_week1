import java.util.List;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat());
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
