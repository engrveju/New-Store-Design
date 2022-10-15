package Store.model;

import Store.enums.Qualification;
import Store.enums.UserRole;

public class Manager extends Person{
    public Manager(String firstName, String lastName, String address, Qualification qualification, UserRole role) {
        super(firstName, lastName, address, qualification, role);
    }
}
