public class Employee extends User{
    private int salary;
    private String name;



    public Employee(String name, int salary, String username, String password) {
        super(username, password);
        this.name = name;
        this.salary = salary;


    }

    public int getSalary() {return salary;}
    public String getName() { return name; }


    public void setSalary(int salary) { this.salary = salary; }
    public void setName(String name) { this.name = name; }

}
