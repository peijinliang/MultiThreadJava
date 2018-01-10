package Chapter01Skills.t1;


public class MyThread extends Thread {


    @Override
    public void run() {
        super.run();
        //当前线程为 Thread 01
        System.out.println("ThreadName:" + Thread.currentThread().getName());
        System.out.println("MyThread");
    }





}
