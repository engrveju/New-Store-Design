package Store;
import Store.enums.Qualification;
import Store.enums.UserRole;
import Store.interfaces.PersonInterface;
import Store.model.*;
import Store.services.CashierService;
import Store.services.CustomerService;
import Store.services.ManagerService;
import Store.services.StoreService;
import Store.store.Cart;
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
    //ADDING PRODUCTS TO STORE FROM CSV
       // CashierService cashierService= new CashierService();
        StoreService serve = new StoreService();
        serve.addItemToStore();

        //  CUSTOMER
        Customer customer1 = new Customer("Customer1","Agbo","Rivers",20_000);
        Customer customer2 = new Customer("Customer2","Chenemi","Lokoja", 10_000);
        Customer customer3 = new Customer("Customer3","Agbo","Rivers", 12_000);
        Customer customer4 = new Customer("Customer4","Agbo","Nnewi",25_000);
        Customer customer5 = new Customer("Customer5","Chenemi","Asaba", 100_000);
        Customer customer6 = new Customer("Customer6","Agbo","Sapele", 45_000);
        Customer customer7 = new Customer("Customer7","Agbo","Akure",32_000);
        Customer customer8 = new Customer("Customer8","Chenemi","Lagos", 210_000);
        Customer customer9 = new Customer("Customer9","Agbo","Ibadan", 14_000);
        Customer customer10 = new Customer("Customer10","Agbo","Enugu",19_000);
        Customer customer11 = new Customer("Customer11","Chenemi","Ogun", 13_000);
        Customer customer12 = new Customer("Customer12","Agbo","Festac", 120_000);
        CustomerService customerService = new CustomerService();
        //Create a new cart for each customer
        Cart customer1Cart = new Cart();
        customerService.buy(customer1Cart,customer1,"Lenovo",3);
        customerService.buy(customer1Cart,customer1,"macbook",3);

        Cart customer2Cart = new Cart();
        customerService.buy(customer2Cart,customer1,"Lenovo",3);
        customerService.buy(customer2Cart,customer1,"macbook",3);

        Cart customer3Cart = new Cart();
        customerService.buy(customer3Cart,customer1,"Lenovo",3);
        customerService.buy(customer3Cart,customer1,"macbook",3);

        Cart customer4Cart = new Cart();
        customerService.buy(customer4Cart,customer1,"Lenovo",3);
        customerService.buy(customer4Cart,customer1,"macbook",3);

        Cart customer5Cart = new Cart();
        customerService.buy(customer5Cart,customer1,"Lenovo",3);
        customerService.buy(customer5Cart,customer1,"macbook",3);

        Cart customer6Cart = new Cart();
        customerService.buy(customer6Cart,customer1,"Lenovo",3);
        customerService.buy(customer6Cart,customer1,"macbook",3);

        Cart customer7Cart = new Cart();
        customerService.buy(customer7Cart,customer1,"Lenovo",3);
        customerService.buy(customer7Cart,customer1,"macbook",3);

        Cart customer8Cart = new Cart();
        customerService.buy(customer8Cart,customer1,"Lenovo",3);
        customerService.buy(customer8Cart,customer1,"macbook",3);

        Cart customer9Cart = new Cart();
        customerService.buy(customer9Cart,customer1,"Lenovo",3);
        customerService.buy(customer9Cart,customer1,"macbook",3);

        Cart customer10Cart = new Cart();
        customerService.buy(customer10Cart,customer1,"Lenovo",3);
        customerService.buy(customer10Cart,customer1,"macbook",3);

        //after adding items to cart, add the cart to Cashiers's cart List
         CashierService.getCustomerCartList().add(customer10Cart);

         int k = CashierService.getCustomerCartList().size();

        System.out.println(k);
        System.out.println(customer10Cart.getCustomerCart().size());

        //System.out.println(StoreList.getProductList().size());
      //  System.out.println(StoreList.getCashierList().size());


    }
}