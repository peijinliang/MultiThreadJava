package Chapter02ConcurrentAccess.DirtyRead.test;


import Chapter02ConcurrentAccess.DirtyRead.entity.PublicVar;
import Chapter02ConcurrentAccess.DirtyRead.extthread.ThreadA;

public class Test {

    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();
            Thread.sleep(200);
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
