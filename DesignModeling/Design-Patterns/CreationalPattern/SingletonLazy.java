public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {

        SingletonLazy obj1 = SingletonLazy.getInstance();
        SingletonLazy obj2 = SingletonLazy.getInstance();

        System.out.println(obj1 == obj2);
    }
}