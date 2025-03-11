import java.util.*;

public class Picker extends Employee {
    private ArrayList<Order> orderList = new ArrayList<Order>();

    public Picker(String username, String password, String name, int salary) {
        super(name, salary, username, password);
    }
}
