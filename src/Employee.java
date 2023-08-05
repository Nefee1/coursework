import java.util.Objects;

public class Employee {
    private final String fullName;
    private int departments = 5;
    private int salary;
    private final int id;
    private static int counter = 1;

    public String getfullName() {
        return fullName;
    }

    public int getDepartments() {
        return departments;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }


    public void setDepartments(int departments) {
        this.departments = departments;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int departments, int salary) {
        this.fullName = fullName;
        this.departments = departments;
        this.salary = salary;
        this.id = counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departments == employee.departments && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departments, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                " fullName = " + fullName + '\'' +
                ", departments = " + departments +
                ", salaryOfEmployees = " + salary +
                '}';
    }
}
