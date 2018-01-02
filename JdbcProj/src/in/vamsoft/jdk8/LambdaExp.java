package in.vamsoft.jdk8;

public class LambdaExp extends Thread{

	public static void main(String[] args) {

		
		Thread t=new Thread(()->System.out.println("Hello"));
		t.start();

	}

}
