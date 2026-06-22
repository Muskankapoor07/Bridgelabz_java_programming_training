public class Main {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.setName("thread_1");
        Thread2 Obj = new Thread2();
        Thread t2 = new Thread(Obj);
        t2.setName("thread_2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
              } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Both threads completed.");
    }
}