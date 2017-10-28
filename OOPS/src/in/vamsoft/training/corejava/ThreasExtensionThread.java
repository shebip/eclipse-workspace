package in.vamsoft.training.corejava;

public class ThreasExtensionThread {

	public static void main(String[] args) {
		System.out.println("Before thread");
		Threadrun rt=new Threadrun();
		  
		Thread t1=new Thread(rt);
		t1.setName("A");
		t1.start();
		t1.setPriority(8);

		Thread t2=new Thread(rt);
		t2.setName("B");
	
		t2.start();
		t2.setPriority(6);
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finished");
		
	}

}
