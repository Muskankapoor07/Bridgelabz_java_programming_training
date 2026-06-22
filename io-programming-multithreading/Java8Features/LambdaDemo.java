interface Greeting {
    void sayHello();
}

public class LambdaDemo {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello Java 8");
        g.sayHello();
    }
}