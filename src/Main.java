import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printEmployes();
        System.out.println("сумму затрат на зарплаты в месяц " + theAmountOfExpensesForTheMonth());
        System.out.println();
        System.out.println("сотрудник с минимальной зарплатой " + minimumSalaryOfAnEmployee());
        System.out.println();
        System.out.println("сотрудник с максимальной зарплатой " + maximumSalaryOfAnEmployee());
        System.out.println();
        System.out.println("среднее значение зарплат " + averageValueOfEmployeesSalaries());
        System.out.println();
        printFullName();
    }

    private static final Employee[] employeeDatabase = {
            new Employee("Иванов Иван Иваныч", 1, 60000),
            new Employee("Семенов Иван Иваныч", 2, 65000),
            new Employee("Гриша Иван Иваныч", 3, 40000),
            new Employee("Татарников Иван Иваныч", 4, 45000),
            new Employee("Карпов Иван Иваныч", 5, 35000),
            new Employee("Торбан Иван Иваныч", 1, 90000),
            new Employee("Вован Иван Иваныч", 2, 11000),
            new Employee("Имба Иван Иваныч", 3, 15000),
            new Employee("Если Иван Иваныч", 4, 20000),
            new Employee("Кукурузов Иван Иваныч", 5, 22000),
    };

    public static int theAmountOfExpensesForTheMonth() {
        int salaryAmmount = 0;
        for (Employee salaryArr : employeeDatabase) {
            salaryAmmount += salaryArr.getSalary();
        }
        return salaryAmmount;
    }

    public static void printEmployes() {
        for (Employee employee : employeeDatabase) {
            System.out.println(employee);
        }
    }

    public static Employee minimumSalaryOfAnEmployee() {
        Employee employeeWithMinsalary = employeeDatabase[0];
        for (Employee employee : employeeDatabase) {
            if (employee.getSalary() < employeeWithMinsalary.getSalary()) {
                employeeWithMinsalary = employee;
            }
        }
        return employeeWithMinsalary;
    }

    public static Employee maximumSalaryOfAnEmployee() {
        Employee employeeWithMaxsalary = employeeDatabase[0];
        for (Employee employee : employeeDatabase) {
            if (employee.getSalary() > employeeWithMaxsalary.getSalary()) {
                employeeWithMaxsalary = employee;
            }
        }
        return employeeWithMaxsalary;
    }

    public static float averageValueOfEmployeesSalaries() {
        return theAmountOfExpensesForTheMonth() / (float) employeeDatabase.length;
    }

    public static void printFullName() {
        for (Employee employee : employeeDatabase) {
            System.out.println(employee.getfullName());
        }
    }
}







