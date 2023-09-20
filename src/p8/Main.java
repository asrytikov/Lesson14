package p8;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        Thread myThread = new Thread(new MyThread(), "MyThread");
        myThread.start();
        try {
            myThread.join();
        }catch (InterruptedException exception){}
        System.out.println("Main thread finished...");

    }

}
