class InheritAnimal {
    void eat() {
        System.out.println("Eating");
    }
}

class InheritDog extends InheritAnimal {
    void bark() {
        System.out.println("Barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        InheritDog dog = new InheritDog();
        dog.eat();
        dog.bark();
    }
}
