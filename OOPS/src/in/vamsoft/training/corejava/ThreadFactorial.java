package in.vamsoft.training.corejava;

import java.util.*;


class Producer extends Thread{
	Consumer consumer;
	private int number;
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	public int getNumber() {
		return number;
	
	}
	public void setNumber(int number) {
		this. number=number;
		
	
	}
	public Producer(String name) {
		super(name);
	}
	public void run() {
		try {
			Scanner s=new Scanner(System.in);
			int num=0;
			System.out.println("Enter Number");
			while((num = s.nextInt())>0) {
				System.out.println("number read by producer" + num);
				this.number=num;
				synchronized (consumer) {
					consumer.notify();
					
				}
				synchronized (this) {
					wait();
					
				}
				
			}
		}
		catch(InterruptedException ie) {
		System.out.println(ie);
		}
	}
}
class Consumer extends Thread{
	Producer producer;
	public Consumer(String name) {
		super(name);
	}
	public void setProducer(Producer producer) {
		this.producer=producer;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				synchronized (this) {
					wait();
					
				}
			}
			catch(InterruptedException ie) {
			System.out.println(ie);
		}
		int fact = factorial(producer.getNumber());
		System.out.println("Factorail calculated for" +producer.getNumber() +":" +fact);
		synchronized (producer) {
			producer.notify();
			
		}
	}
}
private int factorial(int num) {
	int fact=1;
	while(num>0) {
		fact=fact*num;
	num--;
	}
	return fact;
}
}
public class ThreadFactorial {
	public static void main(String[] args) {
		Producer producer=new Producer("Producer");
		Consumer consumer=new Consumer("Consumer");
		
		producer.setConsumer(consumer);
		consumer.setProducer(producer);
		consumer.start();
		producer.start();
		
	}

}
