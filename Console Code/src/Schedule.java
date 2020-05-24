import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity //this annotation shows that this class is mapped to table in the database.
public class Schedule {
    @Id //this annotation determines that scheduleID is the primary key of this table in mySQL
    private String scheduleID;
    private String customerID;
    private String vehiclePlateNum;
    private Date pickUpDate;
    private Date dropOffDate;

    //constructor of this class
    public Schedule(String scheduleID, String customerID, String vehiclePlateNum, Date pickUpDate, Date dropOffDate) {
        this.scheduleID = scheduleID;
        this.customerID = customerID;
        this.vehiclePlateNum = vehiclePlateNum;
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
    }

    public Schedule() {
    }

    //getters and setters
    public String getScheduleID() {
        return scheduleID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public String getVehiclePlateNum() {
        return vehiclePlateNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule = (Schedule) o;


        if (!scheduleID.equals(schedule.scheduleID)) return false;
        if (!customerID.equals(schedule.customerID)) return false;
        if (!vehiclePlateNum.equals(schedule.vehiclePlateNum)) return false;
        if (!pickUpDate.equals(schedule.pickUpDate)) return false;
        return dropOffDate.equals(schedule.dropOffDate);
    }

    @Override
    public int hashCode() {
        int result = scheduleID.hashCode();
        result = 31 * result + customerID.hashCode();
        result = 31 * result + vehiclePlateNum.hashCode();
        result = 31 * result + pickUpDate.hashCode();
        result = 31 * result + dropOffDate.hashCode();

        return result;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleID='" + scheduleID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", vehiclePlateNum='" + vehiclePlateNum + '\'' +
                ", pickUpDate=" + pickUpDate +
                ", dropOffDate=" + dropOffDate +

                '}';
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }


}
