
public class DemoPriority {
	public static void main(String[] args) {
		System.out.println("main started:-"+Thread.currentThread().getName());
		Thread t = new MyThread();
		t.setName("HIGH");
		t.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		System.out.println("main completed"+ Thread.currentThread().getName());
				
	}
}
