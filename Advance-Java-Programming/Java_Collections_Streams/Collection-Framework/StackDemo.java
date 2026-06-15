import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack =
                new Stack<>();

        stack.push("Java");
        stack.push("Python");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
    }
}