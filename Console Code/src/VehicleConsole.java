import java.math.BigDecimal;
import java.util.Scanner;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public class VehicleConsole {
    WestminsterRentalVehicleManager WRVM = new WestminsterRentalVehicleManager();
    Scanner vehicleScanner = new Scanner(System.in);
    Scanner customerScanner = new Scanner(System.in);

    //constructor
    public VehicleConsole() {
        super();
    }

    private int readManagerChoice(int minChoice, int maxChoice) {
        int managerChoice;
        while (true) {
            try {
                Scanner choice = new Scanner(System.in);
                managerChoice = choice.nextInt();
                if (managerChoice >= minChoice && managerChoice <= maxChoice) {
                    break;
                }else{
                    System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return managerChoice;
    }

    public void mainConsole() {
        WRVM.readDatabase();
        System.out.println("*** MAIN CONSOLE ***");
        System.out.println("Please select from the options below");
        System.out.println("1. Manage Vehicles");
        System.out.println("2. Manage Customers");
        System.out.println("3. Open GUI");
        System.out.println("0. Exit Console");
        int managerChoice = readManagerChoice(0, 3); // Minimum is 0 and maximum is 3.
        switch (managerChoice) {
            case 0:
                WRVM.deleteFromDatabase();
                WRVM.addToDatabase();
                WRVM.ENTITY_MANAGER_FACTORY.close();
                System.out.println("End of Console");
                System.exit(0);
                break;
            case 1:
                vehicleConsole();
                break;
            case 2:
                customerConsole();
                break;
            case 3:
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI("http://localhost:4200"));
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            default:
                System.out.println("Invalid. Please enter a value from options above. ");
        }
    }

    private void vehicleConsole() {
        System.out.println("*** VEHICLE CONSOLE ***");
        System.out.println("Please select from the options below");
        System.out.println("1. Manage Cars");
        System.out.println("2. Manage Motorbikes");
        System.out.println("3. View all vehicles");
        System.out.println("0. Exit Console");
        int managerChoice = readManagerChoice(0, 3);
        boolean vehicleConsoleBoolean = true;
        while (vehicleConsoleBoolean) {
            switch (managerChoice) {
                case 0:
                    WRVM.deleteFromDatabase();
                    WRVM.addToDatabase();
                    WRVM.ENTITY_MANAGER_FACTORY.close();
                    System.out.println("End of Console");
                    System.exit(0);
                    break;
                case 1:
                    carConsole();
                    break;
                case 2:
                    motorbikeConsole();
                    break;
                case 3:
                    WRVM.viewVehicleList();
                    vehicleConsoleBoolean = false;
                    break;
                default:
                    System.out.println("Invalid. Please enter a value from options above.");
            }
        }
    }

    public void customerConsole() {
        System.out.println("*** CUSTOMER CONSOLE ***");
        System.out.println("Please select from the options below");
        System.out.println("1. Add Customer");
        System.out.println("2. Delete Customer");
        System.out.println("3. View Customer");
        System.out.println("0. Exit Console");
        int managerChoice = readManagerChoice(0, 3); // Minimum is 0 and maximum is 3.

        boolean customerConsoleBoolean = true;
        while (customerConsoleBoolean) {
            switch (managerChoice) {
                case 0:
                    WRVM.deleteFromDatabase();
                    WRVM.addToDatabase();
                    WRVM.ENTITY_MANAGER_FACTORY.close();
                    System.out.println("End of Console");
                    System.exit(0);
                    break;
                case 1:
                    WRVM.addCustomer(getUserInputCustomer());
                    customerConsoleBoolean = false;
                    break;
                case 2:
                    WRVM.deleteCustomer(WRVM.getDeleteInfoCustomer());
                    customerConsoleBoolean = false;
                    break;
                case 3:
                    WRVM.viewCustomer(WRVM.getViewInfoCustomer());
                    customerConsoleBoolean = false;
                    break;
                default:
                    System.out.println("Invalid. Please enter a value from options above. ");
            }
        }
        customerConsole();
    }


    public void carConsole() {
        System.out.println("*** CAR CONSOLE ***");
        System.out.println("Please select from the options below");
        System.out.println("1. Add Car");
        System.out.println("2. Delete Car");
        System.out.println("3. View Car");
        System.out.println("0. Exit Console");
        int managerChoice = readManagerChoice(0, 3); // Minimum is 0 and maximum is 3.

        boolean carConsoleBoolean = true;
        while (carConsoleBoolean) {
            switch (managerChoice) {
                case 0:
                    WRVM.deleteFromDatabase();
                    WRVM.addToDatabase();
                    WRVM.ENTITY_MANAGER_FACTORY.close();
                    System.out.println("End of Console");
                    System.exit(0);
                    break;
                case 1:
                    WRVM.addCar(getUserInputCar());
                    carConsoleBoolean = false;
                    break;
                case 2:
                    WRVM.deleteCar(WRVM.getDeleteInfoCar());
                    carConsoleBoolean = false;
                    break;
                case 3:
                    WRVM.viewCar(WRVM.getViewInfoCar());
                    carConsoleBoolean = false;
                    break;
                default:
                    System.out.println("Invalid. Please enter a value from options above. ");
            }
        }
    }

    public void motorbikeConsole() {
        System.out.println("*** MOTORBIKE CONSOLE ***");
        System.out.println("Please select from the options below");
        System.out.println("1. Add Motorbike");
        System.out.println("2. Delete Motorbike");
        System.out.println("3. View Motorbike");
        System.out.println("0. Exit Console");
        int managerChoice = readManagerChoice(0, 3); // Minimum is 0 and maximum is 3.

        boolean motorbikeConsoleBoolean = true;
        while (motorbikeConsoleBoolean) {
            switch (managerChoice) {
                case 0:
                    WRVM.deleteFromDatabase();
                    WRVM.addToDatabase();
                    WRVM.ENTITY_MANAGER_FACTORY.close();
                    System.out.println("End of Console");
                    System.exit(0);
                    break;
                case 1:
                    WRVM.addMotorbike(getUserInputMotorbike());
                    motorbikeConsoleBoolean = false;
                    break;
                case 2:
                    WRVM.deleteMotorbike(WRVM.getDeleteInfoMotorbike());
                    motorbikeConsoleBoolean = false;
                    break;
                case 3:
                    WRVM.viewMotorbike(WRVM.getViewInfoMotorbike());
                    motorbikeConsoleBoolean = false;
                    break;
                default:
                    System.out.println("Invalid. Please enter a value from options above. ");
            }
        }
    }

    public Motorbike getUserInputMotorbike() {
        System.out.println("Please enter the following motorbike details");
        Motorbike motorbike = new Motorbike();
        System.out.println("Enter vehicle plate number: ");
        motorbike.setVehiclePlateNum(vehicleScanner.nextLine());
        System.out.println("Enter vehicle make: ");
        motorbike.setVehicleMake(vehicleScanner.nextLine());
        System.out.println("Enter vehicle model: ");
        motorbike.setVehicleModel(vehicleScanner.nextLine());
        System.out.println("Enter vehicle colour: ");
        motorbike.setVehicleColour(vehicleScanner.nextLine());
        System.out.println("Enter vehicle registration number: ");
        motorbike.setVehicleRegNum(vehicleScanner.nextLine());
        System.out.println("Enter vehicle rate per day: ");
        motorbike.setVehicleRatePerDay();
        System.out.println("Enter the motorbike category: ");
        motorbike.setBikeCategory(vehicleScanner.nextLine());
        System.out.println("Enter the motorbike cooling system");
        motorbike.setBikeCoolingSystem(vehicleScanner.nextLine());
        return motorbike;
    }

    public Car getUserInputCar() {
        System.out.println("Please enter the following car details");
        Car car = new Car();
        System.out.println("Enter vehicle plate number: ");
        car.setVehiclePlateNum(vehicleScanner.nextLine());
        System.out.println("Enter vehicle make: ");
        car.setVehicleMake(vehicleScanner.nextLine());
        System.out.println("Enter vehicle model: ");
        car.setVehicleModel(vehicleScanner.nextLine());
        System.out.println("Enter vehicle colour: ");
        car.setVehicleColour(vehicleScanner.nextLine());
        System.out.println("Enter vehicle registration number: ");
        car.setVehicleRegNum(vehicleScanner.nextLine());
        System.out.println("Enter vehicle rate per day: ");
        car.setVehicleRatePerDay();
        System.out.println("Enter car body desciption: ");
        car.setCarBodyDesc(vehicleScanner.nextLine());
        System.out.println("Enter car engine description: ");
        car.setCarEngineDesc(vehicleScanner.nextLine());
        System.out.println("Enter car transmission: ");
        car.setCarTransmission(vehicleScanner.nextLine());
        return car;
    }

    public Customer getUserInputCustomer() {
        System.out.println("Please enter the following customer details");
        Customer customer = new Customer();
        System.out.println("Enter customer ID: ");
        customer.setCustomerID(customerScanner.nextLine());
        System.out.println("Enter customer first name: ");
        customer.setCustomerFirstName(customerScanner.nextLine());
        System.out.println("Enter customer last name: ");
        customer.setCustomerLastName(customerScanner.nextLine());
        System.out.println("Enter customer phone number:");
        customer.setCustomerPhoneNum(customerScanner.nextLine());
        System.out.println("Enter customer licence number:");
        customer.setCustomerLicenseNum(customerScanner.nextLine());
        return customer;
    }

    public static void main(String[] args) {
        // creating new vehicle console object
        VehicleConsole run = new VehicleConsole();
        //running the initiateConsole method in the vehicle console class
        run.mainConsole();

    }
}
