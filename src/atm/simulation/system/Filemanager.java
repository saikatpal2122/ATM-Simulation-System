package atm.simulation.system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {

    private final String FILE_NAME = "account.txt";

   
    public void saveAccount(Account account) {

        try {

            FileWriter fw = new FileWriter(FILE_NAME);

            fw.write(account.getAccountNumber() + "\n");
            fw.write(account.getAccountHolderName() + "\n");
            fw.write(account.getPin() + "\n");
            fw.write(account.getBalance() + "\n");

            fw.close();

            System.out.println("Account Saved Successfully.");

        } catch (Exception e) {

            System.out.println("Error Saving File.");

        }

    }

    
    public Account loadAccount() {

        try {

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String accNo = br.readLine();
            String name = br.readLine();
            int pin = Integer.parseInt(br.readLine());
            double balance = Double.parseDouble(br.readLine());

            br.close();

            return new Account(accNo, name, pin, balance);

        } catch (Exception e) {

            return null;

        }

    }

   
    public void saveHistory(String text) {

        try {

            FileWriter fw = new FileWriter("history.txt", true);

            fw.write(text);

            fw.close();

            System.out.println("History Saved Successfully.");

        } catch (Exception e) {

            System.out.println("History Save Error.");

        }

    }

    
    public String loadHistory() {

        String history = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader("history.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                history += line + "\n";

            }

            br.close();

        } catch (Exception e) {

            System.out.println("History Load Error.");

        }

        return history;

    }

}

