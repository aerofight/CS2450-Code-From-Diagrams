import java.util.*;


public class Inventory {

    private int quantity;
    private String description;

    public Inventory(int quantity, String description) {
        this.quantity = quantity;
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

}
