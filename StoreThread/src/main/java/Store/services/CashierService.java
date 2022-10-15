package Store.services;

import Store.store.Cart;

import java.util.HashSet;
import java.util.Set;

public class CashierService {
    private static Set<Cart> customerCartList = new HashSet<>();

    public static Set<Cart> getCustomerCartList() {
        return customerCartList;
    }
}
