package in.vamsoft.corejava.assignment;

public class MultiThread extends Thread{
	int counter;
	
	public MultiThread(int counter) {
		super();
		this.counter = counter;
	}
	public void run() {
		System.out.println("Inside run method");
		if(counter==5) {
		for(int i=counter;i<=100;i+=counter) {
			
			System.out.println("Counter of value 5   "+i);
			
		}
		
		}
		else if(counter==10) {
			for(int i=0;i<=100;i+=counter) {
				System.out.println("Creating my thread"+i);
				counter+=10;
				System.out.println("Counter of value 10   "+i);
			}
			
			}
		if(counter==100) {
			for(int i=0;i<=100;i+=counter) {
				System.out.println("Creating my thread"+i);
				counter+=100;
				System.out.println("Counter of value 100   "+i);
			}
			
			}
		
	}
public static void main(String[] args) {
	MultiThread m=new MultiThread(5);
	MultiThread m1=new MultiThread(10);
	MultiThread m2=new MultiThread(100);
	m.start();
	m1.start();
	m2.start();
}
	
}
