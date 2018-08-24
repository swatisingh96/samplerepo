
public class AccountDanger implements Runnable {
	private Account acct =  new Account();
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<5;i++) {
			makeWithdrawal(10);
			if(acct.getBalance()<0) {
				System.out.println("account is overdrawn!");
			}
		}

	}
	private void makeWithdrawal(int amt) {
		if(acct.getBalance()>=amt) {
			System.out.println(Thread.currentThread().getName()+"is going to withdraw");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+"completes withdrawal"+acct.getBalance());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("lucy");
		one.start();
		two.start();
	}

}
