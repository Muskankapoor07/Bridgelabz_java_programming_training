class Parent {

    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child Method");
    }
}

public class BuiltInAnnotationsDemo {

    @Deprecated
    public static void oldMethod() {

        System.out.println(
                "Deprecated Method");
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Child c = new Child();

        c.show();

        oldMethod();
    }
}