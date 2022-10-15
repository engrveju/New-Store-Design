package Store.store;

import Store.model.Cashier;
import java.util.*;

public class StoreList {
    private static Set<Cashier> cashierList = new HashSet<>();
    private static Set<Product> productList = new HashSet<>();

    public static Set<Cashier> getCashierList() {

        return cashierList;
    }

    public static void setCashierList(Set<Cashier> cashierList) {
        StoreList.cashierList = cashierList;
    }

    public static Set<Product> getProductList() {
        return productList;
    }

    public static void setProductList(Set<Product> productList) {
        StoreList.productList = productList;
    }
}
