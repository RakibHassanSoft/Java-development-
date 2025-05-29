/*
 * 22. Write a class BankAccount with accountNumber, holderName, and balance. Allow deposit and withdrawal. Perform transactions for 3 accounts stored in an array.
  */
package Third10;

public class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int acc, String name, double bal) {
        accountNumber = acc;
        holderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds.");
    }

    void display() {
        System.out.println(accountNumber + " - " + holderName + ": $" + balance);
    }
}
