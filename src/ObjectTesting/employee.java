package ObjectTesting;

public class employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getAnnualSalary() {
        return (salary*12);
    }

    public int raiseSalary(int i) {
        return (salary*i);
    }

    public String getName() {
        return (firstName+" "+lastName);
    }
}
