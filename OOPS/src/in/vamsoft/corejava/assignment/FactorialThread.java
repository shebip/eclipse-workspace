package in.vamsoft.corejava.assignment;

public class FactorialThread extends Thread {

	
	int fact=1;
	ThreadNumber tn;
	
	
	public ThreadNumber getTn() {
		return tn;
	}

	public void setTn(ThreadNumber tn) {
		this.tn = tn;
	}

	@Override
	public void run() {
		synchronized (this) {
			try {
				
				this.wait();
								
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int num=tn.getNum();
			System.out.println("The get number is :"+num);
			for(int i=0;i<num;i++)
			{
				
				fact+=fact*i;
			}
			System.out.println("The Factorial of the given number is :"+fact);
			
			
			
		}
	}
}
