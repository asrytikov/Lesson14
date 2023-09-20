package p11;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MyThread myThread = new MyThread("MyThread");
        myThread.start();

        try{
            Thread.sleep(1100);
            myThread.interrupt();
            Thread.sleep(1000);
        }catch (InterruptedException exception){}
        System.out.println("Main thread finished...");
    }

}
