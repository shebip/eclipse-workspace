package in.vamsoft.training.corejava;

public class BankingThread implements Runnable{
	
	Account a;
	double withdrawalAmt;

	@Override
	public void run() {
		System.out.println("Balance"+ Thread.currentThread().getName()+""+a.getBalance());
	synchronized (a) {
		a.withdraw(withdrawalAmt);
		
	}
	}
	public BankingThread(Account a,double withdrawalAmt) {
		this.a=a;
		this.withdrawalAmt=withdrawalAmt;
	}
	public static void main(String[] args)  throws InterruptedException{
		Account account=new Account(1000);
		BankingThread b1=new BankingThread(account, 500);
		BankingThread b2=new BankingThread(account, 750);
		Thread t1=new Thread(b1,"Thread1");
		Thread t2=new Thread(b2,"Thread2");
		t1.start();
		t2.start();
		
	}


}
