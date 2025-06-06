public class Main {
    public static void main(String[] args) {
        if (!LoginSystem.login()) return;

        RentalAgency agency = new RentalAgency();

        Car car1 = new Car("KDA120", "Supra ");
        Car car2 = new Car("GKP290", "Harrie");
        agency.addCar(car1);
        agency.addCar(car2);

        Customer cust1 = new Customer("43876345", "Timothy", "DL12345");
        Customer cust2 = new Customer("30747343", "Filex", "DL67890");
        agency.addCustomer(cust1);
        agency.addCustomer(cust2);

        agency.displayCars();

        System.out.println("\n--- Renting Car ---");
        agency.rentCar("KDA120", "43876345");
        agency.rentCar("GKP290", "30747343");

        System.out.println("\n--- Car Status After Renting ---");
        agency.displayCars();
    }
}
