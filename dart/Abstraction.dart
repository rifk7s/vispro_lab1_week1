abstract class Animal {
  void sound();
}

class Dog extends Animal {
  @override
  void sound() {
    print('Woof!');
  }
}

void main() {
  var dog = Dog();
  dog.sound();
}