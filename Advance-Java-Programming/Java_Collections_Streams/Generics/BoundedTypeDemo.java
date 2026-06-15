class Calculator<T extends Number> {

    public double square(T number) {

        return number.doubleValue()
                * number.doubleValue();
    }
}

public class BoundedTypeDemo {

    public static void main(String[] args) {

        Calculator<Integer> c =
                new Calculator<>();

        System.out.println(
                "Square = "
                + c.square(10));
    }
}