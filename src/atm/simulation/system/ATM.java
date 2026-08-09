package atm.simulation.system;

public class ATM {

    private Account account;
    private Transaction transaction = new Transaction();
   
   
    public ATM(Account account) {
    this.account = account;
    transaction = new Transaction();
}

    public void deposit(double amount) {

    if (account.deposit(amount)) {
        transaction.addTransaction("Deposit", amount);
    }

}

    
    public void withdraw(double amount) {

    if (account.withdraw(amount)) {
        transaction.addTransaction("Withdraw", amount);
    }

}
    
   public void showTransactionHistory() {
    transaction.showHistory();
}
  
    public void showBalance() {
        System.out.println("Current Balance : " + account.getBalance());
    }
  
public void changePin(int oldPin, int newPin) {

    if (account.changePin(oldPin, newPin)) {
        transaction.addTransaction("PIN Changed", 0);
    }

}
public void miniStatement() {

    System.out.println("\n========== MINI STATEMENT ==========");

    transaction.showHistory();

    System.out.println("------------------------------------");
    System.out.println("Current Balance : " + account.getBalance());

  }

public void fastCash(int option) {

    switch (option) {

        case 1:
            withdraw(500);
            break;

        case 2:
            withdraw(1000);
            break;

        case 3:
            withdraw(2000);
            break;

        case 4:
            withdraw(5000);
            break;

        default:
            System.out.println("Invalid Option");
    }
}

}