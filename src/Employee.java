import java.util.Arrays;

public class Employee {
    private String surname;
    private String firstName;
    private String middleName;
    private int[] departments = new int[5];
    private int salaryOfEmployees;
    private int id;
    static int counter = 1;
    Employee() {
        id = counter++;
    }
    public void id() {
        System.out.printf("ID: %d \n", id);
    }

    public Employee(String surname, String firstName, String middleName, int[] departments, int salaryOfEmployees) {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.departments = departments;
        this.salaryOfEmployees = salaryOfEmployees;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int[] getDepartments() {
        return departments;
    }

    public int getSalaryOfEmployees() {
        return salaryOfEmployees;
    }

    public int getId() {
        return id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDepartments(int[] departments) {
        this.departments = departments;
    }

    public void setSalaryOfEmployees(int salaryOfEmployees) {
        this.salaryOfEmployees = salaryOfEmployees;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", salaryOfEmployees=" + salaryOfEmployees +
                '}';
    }
}
