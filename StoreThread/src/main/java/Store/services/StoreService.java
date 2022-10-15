package Store.services;
import Store.store.Product;
import Store.store.StoreList;

import java.io.*;

import static java.lang.Integer.parseInt;
//import java.io.BufferedReader;

public class StoreService {
   private String filePath = "src/main/java/Store/StoreCsvFile.csv";

    public void addItemToStore() throws IOException {
        String line;
        try {
            BufferedReader read = new BufferedReader(new FileReader(filePath));
            while ((line = read.readLine()) != null) {
                String[]  productItem = line.split(",");
                Product myProduct = new Product(productItem[0], Integer.parseInt(productItem[1]), productItem[2],
                        Integer.parseInt(productItem[3]), parseInt(productItem[4]));
               // System.out.println(myProduct);
               // System.out.println("added");
                StoreList.getProductList().add(myProduct);
            }
        } catch (IOException e){ e.getStackTrace();}
    }

}
