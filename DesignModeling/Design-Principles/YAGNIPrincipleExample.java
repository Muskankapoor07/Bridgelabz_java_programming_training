public class YAGNIPrincipleExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(10, 20));
    }
}

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}