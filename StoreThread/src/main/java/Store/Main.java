package Store;
import Store.enums.Qualification;
import Store.enums.UserRole;
import Store.interfaces.PersonInterface;
import Store.model.*;
import Store.services.CashierService;
import Store.services.ManagerService;
import Store.services.StoreService;
import Store.store.StoreList;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Peter","Odo","Benin", Qualification.BSC,UserRole.CASHIER){};
        Cashier mike = new Cashier(person);
        ManagerService m = new ManagerService();
        CashierService cashierService= new CashierService();
        StoreService serve = new StoreService();

        serve.addItemToStore();

        System.out.println(StoreList.getProductList().size());


    }
}