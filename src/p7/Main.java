package p7;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MyThread myThread = new MyThread("MyThread");
        myThread.start();
        try {
            myThread.join();
        }catch (InterruptedException exception){}
        System.out.println("Main thread finished...");
    }

}
