
public class Thread1 extends Thread {
	int data;
	public Thread1() {
		data =0;
	}
	public Thread1(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("this is the data:-"+data+"Thread name:-"+Thread.currentThread().getName());
	}
	
}
