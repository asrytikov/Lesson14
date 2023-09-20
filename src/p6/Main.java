package p6;

public class Main {

    public static void main(String[] args) {
       /* Thread thread = Thread.currentThread();
        System.out.println(thread);
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getThreadGroup().getName());*/
        System.out.println("Main thread started...");
        for(int i =1; i<6;i++) {
            new MyThread(i+"_thread").start();
        }
        System.out.println("Main thread finished...");


    }

}
