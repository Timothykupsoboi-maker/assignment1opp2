import java.util.*;

public class RentalAgency {
    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addCar(Car car) { cars.add(car); }
    public void addCustomer(Customer customer) { customers.add(customer); }

    public void rentCar(String carId, String customerId) {
        Car car = findCarById(carId);
        Customer customer = findCustomerById(customerId);

        if (car == null || customer == null) {
            System.out.println("Car or Customer not found.");
            return;
        }

        if (!car.isAvailable()) {
            System.out.println("Car is already rented.");
        } else {
            car.setAvailable(false);
            System.out.println("Car rented successfully to " + customer.getName());
        }
    }

    public Car findCarById(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equalsIgnoreCase(carId)) return car;
        }
        return null;
    }

    public Customer findCustomerById(String customerId) {
        for (Customer c : customers) {
            if (c.getCustomerId().equalsIgnoreCase(customerId)) return c;
        }
        return null;
    }

    public void displayCars() {
        for (Car car : cars) System.out.println(car);
    }
}
