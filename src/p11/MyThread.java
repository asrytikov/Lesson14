package p10;

public class MyThread implements Runnable{

    private boolean isActive;

    public MyThread() {
        this.isActive = true;
    }

    void disable(){
        isActive = false;
    }


    @Override
    public void run() {
        System.out.printf("%s started...\n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive){
            System.out.println("Counter = " + counter++);
            try{
                Thread.sleep(400);
            }catch (InterruptedException exception){}
        }
        System.out.printf("%s finished...\n", Thread.currentThread().getName());
    }
}
