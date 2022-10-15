package Store.model;

import Store.enums.Qualification;
import Store.enums.UserRole;

public class Customer extends Person{
    private int accountbalance;

    public Customer(String firstName, String lastName, String address, int accountBalance) {
        super();
        this.accountbalance = accountBalance;
    }

    public int getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(int accountbalance) {
        this.accountbalance = accountbalance;
    }
}
