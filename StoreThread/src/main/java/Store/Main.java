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
        Person person1 = new Person("Michael","Eze","Benin", Qualification.BSC,UserRole.CASHIER){};
        Person person2 = new Person("Peter","Odo","Benin", Qualification.BSC,UserRole.CASHIER){};
        Person person3 = new Person("James","Okocha","Benin", Qualification.BSC,UserRole.CASHIER){};
        Cashier mike = new Cashier(person1);
        Cashier peter = new Cashier(person2);
        Cashier james = new Cashier(person3);

        ManagerService managerService = new ManagerService();
        managerService.hireCashier(mike);
        managerService.hireCashier(peter);
        managerService.hireCashier(james);

        CashierService cashierService= new CashierService();
        StoreService serve = new StoreService();
        serve.addItemToStore();

        //  CUSTOMER
        Person person4 = new Person("Blessing","Agbo","Rivers", Qualification.BSC,UserRole.CUSTOMER){};
        Customer customer1 = new Customer(person4,30_000);

        System.out.println(StoreList.getProductList().size());
        System.out.println(StoreList.getCashierList().size());


    }
}