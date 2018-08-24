
public class MyRunnable1 implements Runnable {
	private Thread t1;
	
	public MyRunnable1() {
		t1 = new Thread(this);
		t1.start();
		
	}
	
	public MyRunnable1(Thread t1) {
		super();
		this.t1 = t1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name:-"+Thread.currentThread().getName());

	}
	public static void main(String[] args) {
		Runnable r = new MyRunnable1();
		Thread t = new Thread(r);
		t.start();
		
	}

}
