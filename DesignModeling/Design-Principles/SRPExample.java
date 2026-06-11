public class SRPExample {

    public static void main(String[] args) {
        Student student = new Student("Muskan", 101);

        StudentPrinter printer = new StudentPrinter();
        printer.print(student);
    }
}

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class StudentPrinter {

    public void print(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
    }
}