package Store.model;
import Store.enums.*;
import Store.interfaces.PersonInterface;


public abstract class Person implements PersonInterface {
    private String firstName;
    private String lastName;
    private String address;
    private Qualification qualification;
    private UserRole role;

    public Person() {}
    public Person(String firstName, String lastName, String address, Qualification qualification, UserRole role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.qualification = qualification;
        this.role = role;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role+" {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", qualification=" + qualification +
                ", role=" + role +
                '}';
    }
}
