class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;      // this keyword
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Muskan");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        System.out.println();
        s2.display();
    }
}