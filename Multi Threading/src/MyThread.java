
public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("thread started"+Thread.currentThread().getName());
		System.out.println("hello");
	}
}
