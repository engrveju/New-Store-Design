package Store;
import Store.enums.Qualification;
import Store.enums.UserRole;
import Store.interfaces.PersonInterface;
import Store.model.*;
import Store.services.CashierService;
import Store.services.ManagerService;
import Store.store.StoreList;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Peter","Odo","Benin", Qualification.BSC,UserRole.CASHIER){};
       Cashier mike = new Cashier(person);
        ManagerService m = new ManagerService();
        CashierService cashierService= new CashierService();

        System.out.println(m.hireCashier(mike));
        System.out.println(StoreList.getCashierList().size());
        System.out.println(mike.getPerson());
    }
}