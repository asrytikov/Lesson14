package p6;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

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
