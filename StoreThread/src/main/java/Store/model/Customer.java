package Store.model;

public class Customer {
    private Person person;
    private int balance;

    public Customer(Person person, int balance) {
        this.person = person;
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
