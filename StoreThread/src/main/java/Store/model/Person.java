package Store.model;

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
        this.Qualification = qualification;
        this.UserRole = role;
    }
}
