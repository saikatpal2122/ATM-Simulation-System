package atm.simulation.system;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private final ArrayList<String> history;
    private int transactionId;

    
    public Transaction() {
        history = new ArrayList<>();
        transactionId = 1;
    }

   
    public void addTransaction(String type, double amount) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        StringBuilder record = new StringBuilder();

        record.append("Transaction ID : ").append(transactionId).append("\n");
        record.append("Type           : ").append(type).append("\n");

        if (amount > 0) {
            record.append("Amount         : ").append(amount).append("\n");
        }

        record.append("Date & Time    : ")
              .append(now.format(formatter))
              .append("\n");
        record.append("--------------------------------");

        history.add(record.toString());
        transactionId++;
    }

   
    public void showHistory() {

        if (history.isEmpty()) {
            System.out.println("No Transaction Found.");
            return;
        }

        System.out.println("\n========== Transaction History ==========");

        for (String transaction : history) {
            System.out.println(transaction);
        }
    }

  
    public ArrayList<String> getHistory() {
        return new ArrayList<>(history);
    }

    public void clearHistory() {
        history.clear();
        System.out.println("Transaction History Cleared Successfully.");
    }

  
    public int getTotalTransactions() {
        return history.size();
    }
}