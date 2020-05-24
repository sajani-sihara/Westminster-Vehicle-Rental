import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Scanner;
import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //creating the super class Vehicle - children are Car and Motorbike
public abstract class Vehicle implements Comparable<Vehicle>, Serializable {
    @Id //this annotation determines that vehiclePLate Num is the primary key of this table in mySQL
    private String vehiclePlateNum;
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleColour;
    private String vehicleRegNum;
    private BigDecimal vehicleRatePerDay;

    public Vehicle() {
        super();
    }

    //constructor of this class - contains all the instance variables that are generalised to Car and Motorbike
    public Vehicle(String vehiclePlateNum, String vehicleMake, String vehicleModel,
                   String vehicleColour, String vehicleRegNum,
                   BigDecimal vehicleRatePerDay) {
        this.vehiclePlateNum = vehiclePlateNum;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleColour = vehicleColour;
        this.vehicleRegNum = vehicleRegNum;
        setVehicleRatePerDay();
    }

    // here are the getters and setters of all the instance variables
    public void setVehiclePlateNum(String vehiclePlateNum) {
        this.vehiclePlateNum = vehiclePlateNum;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public void setVehicleRegNum(String vehicleRegNum) {
        this.vehicleRegNum = vehicleRegNum;
    }

    public String getVehiclePlateNum() {
        return vehiclePlateNum;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleColour() {
        return vehicleColour;
    }

    public String getVehicleRegNum() {
        return vehicleRegNum;
    }

    public BigDecimal getVehicleRatePerDay() {
        return vehicleRatePerDay;
    }

    //this setter will validate the bigDecimal type
    public BigDecimal setVehicleRatePerDay() {
        this.vehicleRatePerDay = null;
        boolean bigDecimalBoolean = true; //this flag is used for the while loop
        Scanner vehicleScanner = new Scanner(System.in); //getting user input
        while (bigDecimalBoolean) {
            try {
                vehicleRatePerDay = new BigDecimal(vehicleScanner.nextLine());
                //if you enter 0 or anything less than 0, an error message will be shown
                if (vehicleRatePerDay.signum() != 0 && vehicleRatePerDay.signum() > 0) {
                    bigDecimalBoolean = false;
                } else {
                    vehicleRatePerDay = null;
                    System.out.println("Invalid. Please enter a value more than zero.");
                }
                //if you enter a string, an error message will be shown
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Please enter a numerical value.");
            }
        }
        return vehicleRatePerDay;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehiclePlateNum='" + vehiclePlateNum + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleColour='" + vehicleColour + '\'' +
                ", vehicleRegNum='" + vehicleRegNum + '\'' +
                ", vehicleRatePerDay=" + vehicleRatePerDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Vehicle vehicle = (Vehicle) o;

        if (!vehiclePlateNum.equals(vehicle.vehiclePlateNum))
            return false;
        if (!vehicleMake.equals(vehicle.vehicleMake))
            return false;
        if (!vehicleModel.equals(vehicle.vehicleModel))
            return false;
        if (!vehicleColour.equals(vehicle.vehicleColour))
            return false;
        if (!vehicleRegNum.equals(vehicle.vehicleRegNum))
            return false;
        return vehicleRatePerDay.equals(vehicle.vehicleRatePerDay);
    }

    @Override
    public int hashCode() {
        int result = vehiclePlateNum.hashCode();
        result = 31 * result + vehicleMake.hashCode();
        result = 31 * result + vehicleModel.hashCode();
        result = 31 * result + vehicleColour.hashCode();
        result = 31 * result + vehicleRegNum.hashCode();
        result = 31 * result + vehicleRatePerDay.hashCode();
        return result;
    }
}
