public class Thread2 implements Runnable {
    @Override
    public void run(){
        for(int i = 51;i<=100;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}