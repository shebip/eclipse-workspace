package in.vamsoft.corejava.assignment;

public class MainThread {
	
	public static void main(String[] args) {
		ThreadNumber tn=new ThreadNumber();
		FactorialThread ft=new FactorialThread();
		tn.setFt(ft);
		ft.setTn(tn);
		tn.start();
		ft.start();
		
	}

}
