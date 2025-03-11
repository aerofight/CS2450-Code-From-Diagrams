public class Employee extends User{
    private int salary;
    private String name;
    private int updateSalary;



    public Employee(String name, int salary, String username, String password) {
        super(username, password);
        this.name = name;
        this.salary = salary;
        this.setUsername(username);
        this.setPassword(password);


    }

    public int getSalary() {return salary;}
    public String getName() { return name; }
    public int getUpdateSalary() { return updateSalary; }

    public void setUpdateSalary(int updateSalary) { this.updateSalary = updateSalary; }
    public void setSalary(int salary) { this.salary = salary; }
    public String setName(String name) { return name; }

}
