package Chapter01Skills.t1;

public class Run {

    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
        //��ӡ���߳�
        System.out.println("ThreadName:" + Thread.currentThread().getName());
        System.out.println("���н�����");
    }

}
