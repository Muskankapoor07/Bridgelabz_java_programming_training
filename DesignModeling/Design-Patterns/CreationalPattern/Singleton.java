public class Singleton {

   
    private static final Singleton instance = new Singleton();

    
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    
    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton Class");
    }

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        System.out.println(obj1 == obj2);
    }
}