package in.vamsoft.training.corejava;

public class SingletonClass {
  private static SingletonClass ob;

  private SingletonClass() {
    super();
  }

  static {

  }

  public static SingletonClass getInstance() {
    if (ob == null) {
      SingletonClass ob = new SingletonClass();
    }
    return ob;

  }

  public void display() {
    System.out.println("Inside SingletonClass");
  }

}
