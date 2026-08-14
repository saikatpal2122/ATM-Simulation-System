package atm.simulation.system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    private static final String FILE_NAME = "account.txt";
    private static final String HISTORY_FILE = "history.txt";

    public boolean saveAccount(Account account) {

        if (account == null) {
            System.out.println("Account is null.");
            return false;
        }

        try (FileWriter fw = new FileWriter(FILE_NAME)) {

            fw.write(account.getAccountNumber() + "\n");
            fw.write(account.getAccountHolderName() + "\n");
            fw.write(account.getPin() + "\n");
            fw.write(account.getBalance() + "\n");

            System.out.println("Account Saved Successfully.");
            return true;

        } catch (IOException e) {

            System.out.println("Error Saving Account File.");
            return false;
        }
    }

   
    public Account loadAccount() {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String accNo = br.readLine();
            String name = br.readLine();
            int pin = Integer.parseInt(br.readLine());
            double balance = Double.parseDouble(br.readLine());

            return new Account(accNo, name, pin, balance);

        } catch (Exception e) {

            System.out.println("Error Loading Account.");
            return null;
        }
    }

    
    public boolean saveHistory(String text) {

        try (FileWriter fw = new FileWriter(HISTORY_FILE, true)) {

            fw.write(text + System.lineSeparator());

            System.out.println("History Saved Successfully.");
            return true;

        } catch (IOException e) {

            System.out.println("History Save Error.");
            return false;
        }
    }
    
 public void clearHistory() {

    try {

        FileWriter fw = new FileWriter("history.txt", false);
        fw.close();

        System.out.println("History Cleared Successfully.");

    } catch (Exception e) {

        System.out.println("History Clear Error.");

    }
}

    
    public String loadHistory() {

        StringBuilder history = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(HISTORY_FILE))) {

            String line;

            while ((line = br.readLine()) != null) {
                history.append(line).append(System.lineSeparator());
            }

        } catch (IOException e) {

            System.out.println("History Load Error.");
        }

        return history.toString();
    }
}