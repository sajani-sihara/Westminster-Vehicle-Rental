import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Customer implements Comparable<Customer>, Serializable {
    @Id
    private String customerID;
    private String customerFirstName;
    private String customerLastName;
    private String customerPhoneNum;
    private String customerLicenseNum;
    public Customer(){
        super();
    }

    public Customer(String customerID, String customerFirstName,
                    String customerLastName, String customerPhoneNum,
                    String customerLicenseNum) {
        this.customerID = customerID;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerPhoneNum = customerPhoneNum;
        this.customerLicenseNum = customerLicenseNum;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public String getCustomerLicenseNum() {
        return customerLicenseNum;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

    public void setCustomerLicenseNum(String customerLicenseNum) {
        this.customerLicenseNum = customerLicenseNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerPhoneNum='" + customerPhoneNum + '\'' +
                ", customerLicenseNum='" + customerLicenseNum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Customer customer = (Customer) o;

        if (!customerID.equals(customer.customerID))
            return false;
        if (!customerFirstName.equals(customer.customerFirstName))
            return false;
        if (!customerLastName.equals(customer.customerLastName))
            return false;
        if (!customerPhoneNum.equals(customer.customerPhoneNum))
            return false;
        return customerLicenseNum.equals(customer.customerLicenseNum);
    }

    @Override
    public int hashCode() {
        int result = customerID.hashCode();
        result = 31 * result + customerFirstName.hashCode();
        result = 31 * result + customerLastName.hashCode();
        result = 31 * result + customerPhoneNum.hashCode();
        result = 31 * result + customerLicenseNum.hashCode();
        return result;
    }

    @Override
    public int compareTo(Customer o) {
        return this.getCustomerID().compareTo(o.getCustomerID());
    }
}
