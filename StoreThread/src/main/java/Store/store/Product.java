package Store.store;

public class Product {
    private String category;
    private int ID;
    private String productName;
    private int unitPrice;
    private int quantity;

    public Product(String category, int ID,String productName, int unitPrice, int quantity) {
        this.category = category;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", ID=" + ID +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
