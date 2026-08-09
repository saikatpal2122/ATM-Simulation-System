
package atm.simulation.system;


public class Account {
    private String accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;

    
    public Account(String accountNumber, String accountHolderName, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    } 

public boolean deposit(double amount) {

    if (amount > 0) {
        balance += amount;
        System.out.println("Deposit Successful!");
        return true;
    } else {
        System.out.println("Invalid Amount!");
        return false;
    }

}

public boolean withdraw(double amount) {

    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdraw Successful!");
        return true;
    } else {
        System.out.println("Insufficient Balance!");
        return false;
    }

}

public boolean verifyPin(int enteredPin) {
    return this.pin == enteredPin;
    }

public boolean changePin(int oldPin, int newPin) {

    if (this.pin != oldPin) {
        System.out.println("Incorrect Old PIN.");
        return false;
    }

    if (newPin < 1000 || newPin > 9999) {
        System.out.println("PIN must be 4 digits.");
        return false;
    }

    if (oldPin == newPin) {
        System.out.println("New PIN cannot be the same as Old PIN.");
        return false;
    }

    this.pin = newPin;

    System.out.println("PIN Changed Successfully.");

    return true;
    }

public void setPin(int pin) {
    this.pin = pin;
}
}