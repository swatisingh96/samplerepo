
public class DemoJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started:-"+Thread.currentThread().getName());
		Thread t1 = new MyThread();
		t1.setName("join");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main completed"+ Thread.currentThread().getName());
				

	}

}
