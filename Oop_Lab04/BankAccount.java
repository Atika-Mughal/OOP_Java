class BankAccount {

int balance;
int Acc_number;

BankAccount (int balance, int Acc_number) {
this.balance = balance;
this.Acc_number = Acc_number;
}

void deposit(int amount) {
balance += amount;
System.out.println("Deposited balance is: " + balance);
}

void check() {
System.out.println("Balance in account: " + balance); 
}

void withdraw(int amount) {
    if (balance >= amount) {
      balance -= amount;
        System.out.println("Balance after withdraw is: " + balance);
}
    else {
        System.out.println("Insufficient balance in account " + Acc_number);
}
}
public static void main (String[]args) {

BankAccount acc1 = new BankAccount (1000, 1);
BankAccount acc2 = new BankAccount (500, 2);

acc1.check();
acc2.check();

acc1.deposit(500);
acc1.check();
acc2.deposit(1500);
acc2.check();
acc2.withdraw(200);
acc2.check();

}
}