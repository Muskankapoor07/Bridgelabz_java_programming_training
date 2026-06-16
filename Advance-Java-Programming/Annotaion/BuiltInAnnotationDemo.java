class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class BuiltInAnnotationDemo {

    @Deprecated
    public static void oldMethod() {

        System.out.println(
                "This method is deprecated");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();

        oldMethod();
    }
}