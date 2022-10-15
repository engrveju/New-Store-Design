package Store.services;

import Store.model.Customer;
import Store.store.Cart;
import Store.store.Product;
import Store.store.StoreList;

public class CustomerService {
    public String buy(Cart customerCart, Customer customer, String item, int quantity){
        for(Product product:StoreList.getProductList()){
            if(item.equalsIgnoreCase(product.getProductName())){
                customerCart.getCustomerCart().add(product);
                return "Item added to cart";
            }
        }return "Item not Available";
    }
}
