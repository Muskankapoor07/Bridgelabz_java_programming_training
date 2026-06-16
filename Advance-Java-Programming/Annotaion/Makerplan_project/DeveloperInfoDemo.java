import java.lang.annotation.*;
import java.lang.reflect.*;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperInfo {

    String name();
    String date();
}

@DeveloperInfo(
        name = "Muskan Kapoor",
        date = "2025-09-01")
class Employee {

    void display() {
        System.out.println(
                "Employee Class");
    }
}

public class DeveloperInfoDemo {

    public static void main(String[] args) {

        Class<Employee> obj =
                Employee.class;

        if(obj.isAnnotationPresent(
                DeveloperInfo.class)) {

            DeveloperInfo info =
                    obj.getAnnotation(
                            DeveloperInfo.class);

            System.out.println(
                    "Developer Name: "
                            + info.name());

            System.out.println(
                    "Created Date: "
                            + info.date());
        }
    }
}