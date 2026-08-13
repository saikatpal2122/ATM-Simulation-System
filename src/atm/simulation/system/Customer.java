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

    
    public void setCustomerName(String customerName) {
        if (customerName != null && !customerName.isEmpty()) {
            this.customerName = customerName;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        }
    }

   
    public void updateCustomerInfo(String customerName,
                                   String phoneNumber,
                                   String address) {

        setCustomerName(customerName);
        setPhoneNumber(phoneNumber);
        setAddress(address);

        System.out.println("Customer information updated successfully.");
    }

    
    public void displayCustomerInfo() {
        System.out.println("\n--- Customer Information ---");
        System.out.println("Name    : " + customerName);
        System.out.println("Phone   : " + phoneNumber);
        System.out.println("Address : " + address);
    }

    @Override
    public String toString() {
        return "Customer Name : " + customerName +
               "\nPhone Number : " + phoneNumber +
               "\nAddress      : " + address;
    }
}