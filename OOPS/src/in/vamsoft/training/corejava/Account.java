package in.vamsoft.training.corejava;

public class Account {
	double balance;
	public Account(double balance)
	{
		this.balance=balance;
		
	}
  public double getBalance() {
  	return balance;
		
	}
  public void withdraw(double amount) {
  	if((balance-amount)>=0)
  	{
  		try {
  			Thread.sleep(5000);
  		} catch(InterruptedException e) {
  		e.printStackTrace();
  	}
  		balance-=amount;
  		System.out.println("Withdrawal:"+Thread.currentThread().getName()+"Balance"+getBalance());
		
	}
  	else {
  		System.out.println("Insufficient"+Thread.currentThread().getName()+"Balance"+getBalance());
  	}
  	}

}
