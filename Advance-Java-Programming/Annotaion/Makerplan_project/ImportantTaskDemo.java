import java.lang.annotation.*;
import java.lang.reflect.Method;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantTask {
    String value();
}

class TaskManager {

    @ImportantTask("High Priority")
    public void submitProject() {
        System.out.println("Project Submitted");
    }

    public void attendMeeting() {
        System.out.println("Meeting Attended");
    }
}

public class ImportantTaskDemo {

    public static void main(String[] args) {

        Method[] methods =
                TaskManager.class.getDeclaredMethods();

        for(Method method : methods) {

            if(method.isAnnotationPresent(
                    ImportantTask.class)) {

                ImportantTask task =
                        method.getAnnotation(
                                ImportantTask.class);

                System.out.println(
                        "Important Task: "
                                + method.getName());

                System.out.println(
                        "Priority: "
                                + task.value());
            }
        }
    }
}