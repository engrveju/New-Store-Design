package Store.model;
import Store.enums.*;


public abstract class Person {
    private String firstName;
    private String lastName;
    private String address;
    private Qualification qualification;
    private UserRole role;

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
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", qualification=" + qualification +
                ", role=" + role +
                '}';
    }
}
