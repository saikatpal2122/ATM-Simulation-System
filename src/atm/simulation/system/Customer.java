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
        if (customerName != null && !customerName.trim().isEmpty()) {
            this.customerName = customerName;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && !phoneNumber.trim().isEmpty()) {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        }
    }

   
    public void updateCustomerInfo(String customerName, String phoneNumber, String address) {
        setCustomerName(customerName);
        setPhoneNumber(phoneNumber);
        setAddress(address);

        System.out.println("Customer information updated successfully.");
    }

    public void displayCustomerInfo() {
        System.out.println("===== Customer Information =====");
        System.out.println("Name    : " + customerName);
        System.out.println("Phone   : " + phoneNumber);
        System.out.println("Address : " + address);
        System.out.println("================================");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}