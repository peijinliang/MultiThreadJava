package Chapter01Skills.t1;

public class Run {

    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
        //打印主线程
        System.out.println("ThreadName:" + Thread.currentThread().getName());
        System.out.println("运行结束！");
    }

}
