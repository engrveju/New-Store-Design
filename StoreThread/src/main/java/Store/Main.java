package Store;
import Store.enums.Qualification;
import Store.enums.UserRole;
import Store.interfaces.PersonInterface;
import Store.model.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Peter","Odo","Benin", Qualification.MSC,UserRole.MANAGER){};
       Manager mike = new Manager(person);
        System.out.println(mike.getPerson());


    }
}