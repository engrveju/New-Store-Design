package Store.model;

public class Cashier {
    private Person person;

    public Cashier(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
