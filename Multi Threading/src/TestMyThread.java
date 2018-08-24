
public class TestMyThread {

	public static void main(String[] args) {
			System.out.println("main started"+Thread.currentThread().getName());
		
			Thread t = new MyThread();
			t.run();
			

			Thread t1 = new MyThread();
			t1.run();
			System.out.println("main completed"+Thread.currentThread().getName());
	}
}
