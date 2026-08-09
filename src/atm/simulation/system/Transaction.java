package atm.simulation.system;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private ArrayList<String> history = new ArrayList<>();
    private int transactionId = 1;

  public void addTransaction(String type, double amount) {

    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String dateTime = now.format(formatter);

    String record;

    if (amount == 0) {

        record = "Transaction ID : " + transactionId
                + "\nType           : " + type
                + "\nDate & Time    : " + dateTime
                + "\n--------------------------------";

    } else {

        record = "Transaction ID : " + transactionId
                + "\nType           : " + type
                + "\nAmount         : " + amount
                + "\nDate & Time    : " + dateTime
                + "\n--------------------------------";

    }

    history.add(record);
    transactionId++;

}

    public void showHistory() {

        if (history.isEmpty()) {
            System.out.println("No Transaction Found.");
        } else {
            System.out.println("\n===== Transaction History =====");

            for (String h : history) {
                System.out.println(h);
            }
        }

    }

}