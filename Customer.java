public class Customer {
    private String customerId;
    private String name;
    private String licenseNumber;

    public Customer(String customerId, String name, String licenseNumber) {
        this.customerId = customerId;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getLicenseNumber() { return licenseNumber; }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", License: " + licenseNumber;
    }
}
