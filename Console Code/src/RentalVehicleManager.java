public interface RentalVehicleManager {
    void addCar(Car car);
    void addMotorbike(Motorbike motorbike);
    void addCustomer(Customer customer);
    void viewCar(Car car);
    void viewMotorbike(Motorbike motorbike);
    void viewCustomer(Customer customer);
    void deleteCar(Car car);
    void deleteMotorbike(Motorbike motorbike);
    void deleteCustomer(Customer customer);

    void viewVehicleList();
    void readDatabase();
    void addToDatabase();
    void deleteFromDatabase();
}
