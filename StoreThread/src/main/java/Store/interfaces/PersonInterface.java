package Store.interfaces;

import Store.enums.Qualification;
import Store.enums.UserRole;

public interface PersonInterface {


     String getFirstName();
     void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getAddress();

    void setAddress(String address) ;

    Qualification getQualification() ;

    void setQualification(Qualification qualification);

    UserRole getRole();

    void setRole(UserRole role);
}
