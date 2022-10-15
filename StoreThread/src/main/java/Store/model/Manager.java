package Store.model;

import Store.enums.Qualification;
import Store.enums.UserRole;

public class Manager{
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
