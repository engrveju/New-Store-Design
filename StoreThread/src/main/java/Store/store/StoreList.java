package Store.store;

import Store.model.Cashier;
import java.util.*;

public class StoreList {
    private static List<Cashier> cashierList = new ArrayList<>();
    private static Set<Product> productList = new HashSet<>();

    public static List<Cashier> getCashierList() {
        return cashierList;
    }

    public static void setCashierList(List<Cashier> cashierList) {
        StoreList.cashierList = cashierList;
    }

    public static Set<Product> getProductList() {
        return productList;
    }

    public static void setProductList(Set<Product> productList) {
        StoreList.productList = productList;
    }
}
