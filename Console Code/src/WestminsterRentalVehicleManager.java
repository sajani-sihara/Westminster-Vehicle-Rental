import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WestminsterRentalVehicleManager implements RentalVehicleManager {
    //three lists as instance variables
    private List<Car> carList; //contains all the car objects
    private List<Motorbike> motorbikeList; //contains all the motorbike objects
    private List<Customer> customerList = new ArrayList<>(); //contains all the customer objects

    //two scanners to get user input
    Scanner vehicleScanner = new Scanner(System.in);
    Scanner customerScanner = new Scanner(System.in);

    //this is necessary for the java persistence api
    public static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("WRVMPersistenceUnit");

    //constructor
    public WestminsterRentalVehicleManager() {
    }

    //method that adds a car object to the car list
    public void addCar(Car car) {
        carList.add(car);
    }

    //method that adds a motorbike object to the motorbike list
    public void addMotorbike(Motorbike motorbike) {
        motorbikeList.add(motorbike);
    }

    //method that adds a customer object to the customer list
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    //method that views a car object
    public void viewCar(Car car) {
        System.out.println("Car Plate: " + car.getVehiclePlateNum());
        System.out.println("Car Make: " + car.getVehicleMake());
        System.out.println("Car Model: " + car.getVehicleModel());
        System.out.println("Rate per Day: " + car.getVehicleRatePerDay());
    }

    //method that asks for the ID of the car that the user would like to view
    public Car getViewInfoCar() {
        Car tempCar = null;
        System.out.println("Enter the ID of the car you would like to view: ");
        String plateNum = vehicleScanner.nextLine();
        for (Car car : carList) {
            if (plateNum.equals(car.getVehiclePlateNum())) {
                tempCar = car;
            }
        }
        return tempCar;
    }

    //method that views a motorbike object
    public void viewMotorbike(Motorbike motorbike) {
        System.out.println("Motorbike Plate: " + motorbike.getVehiclePlateNum());
        System.out.println("Motorbike Make: " + motorbike.getVehicleMake());
        System.out.println("Motorbike Model: " + motorbike.getVehicleModel());
        System.out.println("Rate per Day: " + motorbike.getVehicleRatePerDay());
    }

    //method that asks for the ID of the motorbike that the user would like to view
    public Motorbike getViewInfoMotorbike() {
        Motorbike tempMotorbike = null;
        System.out.println("Enter the ID of the motorbike you would like to view: ");
        String plateNum = vehicleScanner.nextLine();
        for (Motorbike motorbike : motorbikeList) {
            if (plateNum.equals(motorbike.getVehiclePlateNum())) {
                tempMotorbike = motorbike;
            }
        }
        return tempMotorbike;
    }

    //method that views a customer object
    public void viewCustomer(Customer customer) {
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("Customer First Name: " + customer.getCustomerFirstName());
        System.out.println("Customer Last Name: " + customer.getCustomerLastName());
        System.out.println("Customer License Num: " + customer.getCustomerLicenseNum());
        System.out.println("Customer Phone Num: " + customer.getCustomerPhoneNum());
    }

    //method that asks for the ID of the customer that the user would like to view
    public Customer getViewInfoCustomer() {
        Customer tempCustomer = null;
        System.out.println("Enter the ID of the motorbike you would like to view: ");
        String plateNum = customerScanner.nextLine();
        for (Customer customer : customerList) {
            if (plateNum.equals(customer.getCustomerID())) {
                tempCustomer = customer;
            }
        }
        return tempCustomer;
    }

    //method that views the details of the deleted Car object and removes that object from the list
    public void deleteCar(Car car) {
        carList.remove(car);
        System.out.println("Deleted car details:");
        System.out.println("Car Plate: " + car.getVehiclePlateNum());
        System.out.println("Car Make: " + car.getVehicleMake());
        System.out.println("Car Model: " + car.getVehicleModel());
        System.out.println("Rate per Day: " + car.getVehicleRatePerDay());
    }
    //method that asks for the ID of the car that the user would like to delete
    public Car getDeleteInfoCar() {
        System.out.println("Enter the ID of the car you would like to delete: ");
        String plateNum = vehicleScanner.nextLine();
        Car removeCar = null;
        for (Car car : carList) {
            if (plateNum.equals(car.getVehiclePlateNum())) {
                removeCar = car;
            }
        }
        return removeCar;
    }

    //method that views the details of the deleted Motorbike object and removes that object from the list
    public void deleteMotorbike(Motorbike motorbike) {
        motorbikeList.remove(motorbike);
        System.out.println("Deleted bike details:");
        System.out.println("Bike Plate: " + motorbike.getVehiclePlateNum());
        System.out.println("Bike Make: " + motorbike.getVehicleMake());
        System.out.println("Bike Model: " + motorbike.getVehicleModel());
        System.out.println("Rate per Day: " + motorbike.getVehicleRatePerDay());
    }

    //method that asks for the ID of the motorbike that the user would like to delete
    public Motorbike getDeleteInfoMotorbike() {
        System.out.println("Enter the ID of the motorbike you would like to delete: ");
        String plateNum = vehicleScanner.nextLine();
        Motorbike removeMotorbike = null;
        for (Motorbike motorbike : motorbikeList) {
            if (plateNum.equals(motorbike.getVehiclePlateNum())) {
                removeMotorbike = motorbike;
            }
        }
        return removeMotorbike;
    }

    //method that views the details of the deleted Customer object and removes that object from the list
    public void deleteCustomer(Customer customer) {
        customerList.remove(customer);
        System.out.println("Deleted customer details:");
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("First Name: " + customer.getCustomerFirstName());
        System.out.println("Last Name: " + customer.getCustomerLastName());
        System.out.println("Phone Number: " + customer.getCustomerPhoneNum());
    }

    //method that asks for the ID of the customer that the user would like to delete
    public Customer getDeleteInfoCustomer() {
        System.out.println("Enter the ID of the customer you would like to delete: ");
        String plateNum = customerScanner.nextLine();
        Customer removeCustomer = null;
        for (Customer customer : customerList) {
            if (plateNum.equals(customer.getCustomerID())) {
                removeCustomer = customer;
            }
        }
        return removeCustomer;
    }

    //method that views all the vehicles
    public void viewVehicleList() {
        if (carList == null && motorbikeList == null) {
        } else {
            System.out.println("Plate Num\tMake\tModel\tRate");
            Collections.sort(carList); //sorted the lists
            for (Car car : carList) { // for loop to view the car list
                System.out.println(car.getVehiclePlateNum() + "\t\t" + car.getVehicleMake() + "\t" + car.getVehicleModel() + "\t" + car.getVehicleRatePerDay());
            }
            Collections.sort(motorbikeList); // sorted the lists
            for (Motorbike motorbike : motorbikeList) { //for loop to view the bike list
                System.out.println(motorbike.getVehiclePlateNum() + "\t\t" + motorbike.getVehicleMake() + "\t" + motorbike.getVehicleModel() + "\t" + motorbike.getVehicleRatePerDay());
            }
        }
    }

    public void readDatabase() {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;

        try {
            et = em.getTransaction();
            et.begin();
            carList = em.createQuery("select c from Car c").getResultList();
            motorbikeList = em.createQuery("select m from Motorbike m").getResultList();
            customerList = em.createQuery("select cu from Customer cu").getResultList();
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void addToDatabase() {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;

        try {
            et = em.getTransaction();
            et.begin();

            for (Car car : carList) {
                em.persist(car);
            }
            for (Motorbike motorbike : motorbikeList) {
                em.persist(motorbike);
            }
            for (Customer customer : customerList) {
                em.persist(customer);
            }
            et.commit();
        } catch (NullPointerException ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();

        } finally {
            em.close();
        }
    }

    public void deleteFromDatabase() {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;

        try {
            et = em.getTransaction();
            et.begin();

            List<Car> carRemoveList = em.createQuery("select c from Car c").getResultList();
            List<Motorbike> motorbikeRemoveList = em.createQuery("select m from Motorbike m").getResultList();
            List<Customer> customerRemoveList = em.createQuery("select cu from Customer cu").getResultList();
            for (Car car : carRemoveList) {
                Car managed = em.merge(car);
                em.remove(managed);
            }
            for (Motorbike motorbike : motorbikeRemoveList) {
                Motorbike managed = em.merge(motorbike);
                em.remove(managed);
            }
            for (Customer customer : customerRemoveList) {
                Customer managed = em.merge(customer);
                em.remove(managed);
            }
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }

    }


}
