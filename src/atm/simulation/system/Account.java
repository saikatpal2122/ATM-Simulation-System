package atm.simulation.system;

public class Account {

    private String accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;

    public Account(String accountNumber, String accountHolderName,
                   int pin, double balance) {
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
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return false;
        }

        balance += amount;
        System.out.println("Deposit Successful!");
        System.out.println("Current Balance: " + balance);

        return true;
    }

   
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return false;
        }

        balance -= amount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: " + balance);

        return true;
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
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
        } else {
            System.out.println("Invalid PIN. PIN must be 4 digits.");
        }
    }

    
    public boolean hasSufficientBalance(double amount) {
        return amount > 0 && amount <= balance;
    }

    
    public void displayAccountInfo() {
        System.out.println("\n===== ACCOUNT INFORMATION =====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("===============================");
    }
}