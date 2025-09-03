class Person {
  String _name = '';
  int _age = 0;
  
  void setName(String name) {
    _name = name;
  }
  
  void setAge(int age) {
    _age = age;
  }
  
  String getName() {
    return _name;
  }
  
  int getAge() {
    return _age;
  }
}

void main() {
  var person = Person();
  person.setName('John');
  person.setAge(25);
  print('Nama: ${person.getName()}');
  print('Umur: ${person.getAge()} tahun');
}
