import java.lang.annotation.*;
import java.lang.reflect.Method;

// Creating Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface ImportantTask {

    String priority();
}

class Employee {

    @ImportantTask(priority = "High")
    public void submitReport() {

        System.out.println(
                "Report Submitted");
    }
}

public class CustomAnnotationDemo {

    public static void main(String[] args)
            throws Exception {

        Employee emp = new Employee();

        emp.submitReport();

        Method method =
                Employee.class.getMethod(
                        "submitReport");

        if(method.isAnnotationPresent(
                ImportantTask.class)) {

            ImportantTask task =
                    method.getAnnotation(
                            ImportantTask.class);

            System.out.println(
                    "Priority: "
                            + task.priority());
        }
    }
}