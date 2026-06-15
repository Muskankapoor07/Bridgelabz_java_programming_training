class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericClassDemo {

    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);

        Box<String> strBox = new Box<>();
        strBox.setValue("Muskan");

        System.out.println(intBox.getValue());
        System.out.println(strBox.getValue());
    }
}