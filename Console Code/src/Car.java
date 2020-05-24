import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
//this annotation shows that this class is mapped to table in the database. also this is a child class of Vehicle.
public class Car extends Vehicle implements Serializable {
    //these are the variables that are unique to Car class
    private String carBodyDesc;
    private String carEngineDesc;
    private String carTransmission;

    public Car() {
        super();
    }

    //constructor of Car class
    public Car(String vehiclePlateNum, String vehicleMake, String vehicleModel, String vehicleColour, String vehicleRegNum, BigDecimal vehicleRatePerDay, String carBodyDesc, String carEngineDesc, String carTransmission) {
        super(vehiclePlateNum, vehicleMake, vehicleModel, vehicleColour, vehicleRegNum, vehicleRatePerDay);
        this.carBodyDesc = carBodyDesc;
        this.carEngineDesc = carEngineDesc;
        this.carTransmission = carTransmission;
    }

    //getters and setters for all the variables
    public String getCarBodyDesc() {
        return carBodyDesc;
    }

    public void setCarBodyDesc(String carBodyDesc) {
        this.carBodyDesc = carBodyDesc;
    }

    public String getCarEngineDesc() {
        return carEngineDesc;
    }

    public void setCarEngineDesc(String carEngineDesc) {
        this.carEngineDesc = carEngineDesc;
    }

    public String getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(String carTransmission) {
        this.carTransmission = carTransmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBodyDesc='" + carBodyDesc + '\'' +
                ", carEngineDesc='" + carEngineDesc + '\'' +
                ", carTransmission='" + carTransmission + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Car car = (Car) o;

        if (!carBodyDesc.equals(car.carBodyDesc)) return false;
        if (!carEngineDesc.equals(car.carEngineDesc)) return false;
        return carTransmission.equals(car.carTransmission);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carBodyDesc.hashCode();
        result = 31 * result + carEngineDesc.hashCode();
        result = 31 * result + carTransmission.hashCode();
        return result;
    }

    public int compareTo(Vehicle o) {
        return 0;
    }
}
