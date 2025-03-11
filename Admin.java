public class Admin extends Employee {
    private String clearanceLevel;

    public Admin(String username, String password, String clearanceLevel, String name, int salary) {
        super(username, password, name, salary);
        this.clearanceLevel = clearanceLevel;
    }
}
