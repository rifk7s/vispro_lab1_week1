class Car {
  String brand;
  
  Car(this.brand);
  
  void honk() {
    print('$brand says beep!');
  }
}

void main() {
  var car = Car('BMW');
  car.honk();
}
