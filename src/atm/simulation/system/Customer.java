package atm.simulation.system;

public class Customer {

    private String customerName;
    private String phoneNumber;
    private String address;

   
    public Customer(String customerName, String phoneNumber, String address) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

   
    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

}