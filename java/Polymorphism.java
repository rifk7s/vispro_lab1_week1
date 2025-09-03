class PolyAnimal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class PolyDog extends PolyAnimal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

class PolyCat extends PolyAnimal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        PolyAnimal animal1 = new PolyDog();
        PolyAnimal animal2 = new PolyCat();
        animal1.sound();
        animal2.sound();
    }
}
