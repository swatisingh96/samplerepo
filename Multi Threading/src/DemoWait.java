
public class DemoWait {

	public static void main(String[] args) {
		// TODO Auto-genera'ted method stub
		
		DemoNotify m = new DemoNotify();
		m.start(); 
		try {
			synchronized(m) {			
				m.wait();
				System.out.println("sum:-"+m.sum);
				} 
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("sum:-"+m.sum);

	}

}
