package p9;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Runnable runnable = ()->{
            System.out.printf("%s started...\n", Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            }catch (InterruptedException exception){
                System.out.println("Thread interrupted");
            }
            System.out.printf("%s finished...\n", Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable, "MyThread");
        thread.start();
        System.out.println("Main thread finished...");



    }

}
