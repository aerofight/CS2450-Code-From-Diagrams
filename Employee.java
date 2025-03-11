public class Employee extends User{
    public Employee(String firstName, String lastName, String email, String password) {}

    public Employee(String username, String password) {
        super(username, password);
    }
}
