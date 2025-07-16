
package Computer_Supply_Store;

public class Customer {

    private String customerName;
    private String customerID;
    private String Email;
    private int Age;

    public Customer() {
        this("", "", "", 0);
    }

    public Customer(String customerName, String customerID, String Email, int Age) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.Email = Email;
        setAge(Age);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        if (Age < 18) {
            throw new IllegalArgumentException("you must be +18 ");
        }
        this.Age = Age;
    }
       
    

    public String customerDetails() {
        return "\nCustomer Name: " + customerName + "\nCustomer ID: " + customerID
                + "\nCustomer Email: " + Email + "\nCustomer Age: " + Age;
    }

}
