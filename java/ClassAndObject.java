class Car {
    String brand;
    
    Car(String brand) {
        this.brand = brand;
    }
    
    void honk() {
        System.out.println(brand + " says beep!");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        var car = new Car("BMW");
        car.honk();
    }
}
