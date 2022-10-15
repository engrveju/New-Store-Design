package Store.services;

import Store.enums.Qualification;
import Store.model.Cashier;
import Store.store.StoreList;

public class ManagerService {
    public String hireCashier(Cashier cashier){
        if(cashier.getPerson().getQualification().equals(Qualification.BSC)){
            StoreList.getCashierList().add(cashier);
            return "Congrats you have been hired";
        } return "Sorry your application is unsuccessful";
    }
}
