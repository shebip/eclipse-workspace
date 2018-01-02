
public class ThreadGroupInJava {
  public static void main(String[] args) {

    ThreadGroup parentGroup = new ThreadGroup("Parent Thread Group");

    Thread t1 = new Thread(parentGroup, "Thread 1");

    Thread t2 = new Thread(parentGroup, "Thread 2");

    ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Thread Group");

    Thread t3 = new Thread(childGroup, "Thread 3");
  }
}