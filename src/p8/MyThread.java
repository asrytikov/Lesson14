package p8;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s started...\n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        }catch (InterruptedException exception){
            System.out.println("Thread interrupted");
        }
        System.out.printf("%s finished...\n", Thread.currentThread().getName());
    }
}
