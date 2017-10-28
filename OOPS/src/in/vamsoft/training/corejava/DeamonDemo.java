package in.vamsoft.training.corejava;
class UserThread extends Thread{
	public void run()
	{
		for(int i = 0;i<=3;i++) {
			System.out.println("User Thread"+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
class DeamonThread extends Thread{
	public void run() {
		for(int i = 0;i<=10;i++) {
			System.out.println("Deamon Thread");
		}
	}
}
public class DeamonDemo{
	public static void main(String args[]) { 
	UserThread userThread=new UserThread();
	DeamonThread dt=new DeamonThread();
	DeamonDemo d=new DeamonDemo();
	d.setDeamonDemo(true);
	userThread.start();
	dt.start();
  
	}

	private void setDeamonDemo(boolean b) {
		// TODO Auto-generated method stub
		
	}


	}  


