package in.vamsoft.thread;

public class ThreadExample extends Thread{
  public void run()
  {
    System.out.println("Thread"+Thread.currentThread());
    
  }

  public static void main(String[] args) {
    int n=5;
    for(int i=0;i<n;i++) {
      ThreadExample t=new ThreadExample();
      t.start();
    }
    
  }

}
