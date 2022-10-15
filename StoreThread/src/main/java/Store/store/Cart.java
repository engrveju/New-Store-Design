package Store.store;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private Set<Product> customerCart = new HashSet<>();

    public Set<Product> getCustomerCart() {
        return customerCart;
    }

    public void setCustomerCart(Set<Product> customerCart) {
        this.customerCart = customerCart;
    }
}
