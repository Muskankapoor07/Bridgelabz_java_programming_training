class Employee {

    private int empId;
    private String name;

    static String company = "BridgeLabz";

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void display() {
        System.out.println(empId + " " + name + " " + company);
    }

    static void companyInfo() {
        System.out.println("Company Name: " + company);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee.companyInfo();

        Employee e1 = new Employee(1, "Muskan");
        Employee e2 = new Employee(2, "Aman");

        e1.display();
        e2.display();
    }
}