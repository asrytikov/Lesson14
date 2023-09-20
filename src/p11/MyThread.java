package p11;

public class MyThread extends Thread{

    public MyThread(String name) {
       super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started...\n", Thread.currentThread().getName());
        int counter = 1;
        while (!isInterrupted()){
            System.out.println("Counter = " + counter++);
            try{
                Thread.sleep(100);
            }catch (InterruptedException exception){
                interrupt();
            }

        }
        System.out.printf("%s finished...\n", Thread.currentThread().getName());
    }
}
