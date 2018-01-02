package in.vamsoft.basics;

public class StaticExample {
  static int x=5;
  public static  void method() {
    System.out.println("hi");
  }

  public static void main(String[] args) {
    StaticExample.method();
    System.out.println(x);
  }

}
