class Employee {

    String name;
    int wagePerHour;
    int hoursWorked;

    Employee(String name,
             int wagePerHour,
             int hoursWorked) {

        this.name = name;
        this.wagePerHour = wagePerHour;
        this.hoursWorked = hoursWorked;
    }

    int calculateSalary() {
        return wagePerHour * hoursWorked;
    }
}

public class EmployeeWage {

    public static void main(String[] args) {

        Employee emp =
                new Employee(
                        "Muskan",
                        200,
                        25);

        System.out.println(
                "Employee : " + emp.name);

        System.out.println(
                "Salary : ₹" +
                        emp.calculateSalary());
    }
}