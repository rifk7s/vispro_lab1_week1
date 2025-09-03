// Encapsulation example in Dart
class BankAccount {
  double _balance;

  BankAccount(this._balance);

  double get balance => _balance;

  void deposit(double amount) {
    _balance += amount;
  }

  void withdraw(double amount) {
    if (amount <= _balance) {
      _balance -= amount;
    } else {
      print('Insufficient funds');
    }
  }
}

void main() {
  var account = BankAccount(100.0);
  account.deposit(50.0);
  account.withdraw(30.0);
  print('Balance: ${account.balance}');
}
