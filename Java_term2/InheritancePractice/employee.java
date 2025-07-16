package InheritancePractice;
public class employee {
    private String name;
    private String emailAddress;
    private String phone;
    private String department;
    private String address;
    private int yearOfBirth;
    
    public employee (){
        System.out.println("No parameter constructor _ super class");
    }

    public employee(String name, String emailAddress, String phone, String department, String address, int yearOfBirth) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.department = department;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
}




