package Chapter02ConcurrentAccess.DirtyRead.extthread;


import Chapter02ConcurrentAccess.DirtyRead.entity.PublicVar;

public class ThreadA extends Thread {

	private PublicVar publicVar;

	public ThreadA(PublicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}

	@Override
	public void run() {
		super.run();
		publicVar.setValue("B", "BB");
	}
}
