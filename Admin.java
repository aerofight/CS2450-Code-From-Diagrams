public class Admin extends Employee {
    private String clearanceLevel;

    public Admin(String username, String password, String clearanceLevel, String name, int salary) {
        super(name, salary, username, password);
        this.clearanceLevel = clearanceLevel;
    }

    public void setClearanceLevel(String clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }

    public String getClearanceLevel() {
        return clearanceLevel;
    }
}
