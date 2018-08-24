
public class TestThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started"+Thread.currentThread().getName());
    Thread t1 = new Thread1(2);
    t1.setName("MyThread1");
    Thread t2 = new Thread1(89);
    t2.setName("MyThread2");
    t1.start();
    t2.start();
    System.out.println("main completed"+Thread.currentThread().getName());
	}

}
