import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity //this annotation shows that this class is mapped to table in the database. also this is a child class of Vehicle.
public class Motorbike extends Vehicle {
    //these are the variables that are unique to Motorbike
    private String bikeCategory;
    private String bikeCoolingSystem;

    public Motorbike() {
        super();
    }

    //constructor of this class
    public Motorbike(String vehiclePlateNum, String vehicleMake, String vehicleModel, String vehicleColour, String vehicleRegNum, BigDecimal vehicleRatePerDay, String bikeCategory, String bikeCoolingSystem) {
        super(vehiclePlateNum, vehicleMake, vehicleModel, vehicleColour, vehicleRegNum, vehicleRatePerDay);
        this.bikeCategory = bikeCategory;
        this.bikeCoolingSystem = bikeCoolingSystem;
    }

    //getters and setters for all the variables
    public String getBikeCategory() {
        return bikeCategory;
    }

    public void setBikeCategory(String bikeCategory) {
        this.bikeCategory = bikeCategory;
    }

    public String getBikeCoolingSystem() {
        return bikeCoolingSystem;
    }

    public void setBikeCoolingSystem(String bikeCoolingSystem) {
        this.bikeCoolingSystem = bikeCoolingSystem;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "bikeCategory='" + bikeCategory + '\'' +
                ", bikeCoolingSystem='" + bikeCoolingSystem + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Motorbike motorbike = (Motorbike) o;

        if (!bikeCategory.equals(motorbike.bikeCategory)) return false;
        return bikeCoolingSystem.equals(motorbike.bikeCoolingSystem);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + bikeCategory.hashCode();
        result = 31 * result + bikeCoolingSystem.hashCode();
        return result;
    }

    public int compareTo(Vehicle o) {
        return 0;
    }
}
