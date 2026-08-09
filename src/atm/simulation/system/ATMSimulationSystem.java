package atm.simulation.system;
import java.util.Scanner;
public class ATMSimulationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileManager fileManager = new FileManager();
        
        Account acc = fileManager.loadAccount();
        if (acc == null) {
            acc = new Account("1001", "Saikat", 1234, 5000);
        }
        
        ATM atm = new ATM(acc);
       
        System.out.println("========== ATM LOGIN ==========");
        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();
        System.out.print("Enter PIN: ");
        int pin = input.nextInt();
        if (!accountNumber.equals(acc.getAccountNumber()) || !acc.verifyPin(pin)) {
            System.out.println("\nInvalid Account Number or PIN!");
            return;
        }
        System.out.println("\nLogin Successful!");
        int choice;
        do {
           System.out.println("\n========== ATM MENU ==========");
           System.out.println("1. Deposit");
           System.out.println("2. Withdraw");
           System.out.println("3. Check Balance");
           System.out.println("4. Transaction History");
           System.out.println("5. Change PIN");
           System.out.println("6. Fast Cash");
           System.out.println("7. Exit");
           System.out.print("Enter Your Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = input.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                    
                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = input.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                    
                case 3:
                    atm.showBalance();
                    break;
                    
               case 4:
                    atm.showTransactionHistory();
                    break;
                    
                case 5:
                    System.out.print("Enter Old PIN: ");
                    int oldPin = input.nextInt();
                    System.out.print("Enter New PIN: ");
                    int newPin = input.nextInt();
                    atm.changePin(oldPin, newPin);
                    break;
                    
                case 6:
                    System.out.println("\n===== FAST CASH =====");
                    System.out.println("1. 500");
                    System.out.println("2. 1000");
                    System.out.println("3. 2000");
                    System.out.println("4. 5000");
                    System.out.print("Select Option: ");
                    int option = input.nextInt();
                    atm.fastCash(option);
                    break;
                    
                case 7:
                    System.out.println("Thank You for Using ATM.");
                    break;
                    
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 7);
        
        fileManager.saveAccount(acc);
        input.close();
    }
}