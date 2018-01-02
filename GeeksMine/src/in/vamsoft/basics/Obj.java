package in.vamsoft.basics;

public class Obj {
  int n;

  public void num(int r) {
    n = r;
    System.out.println(n);
  }

  public void sample() {
    System.out.println("Object check");
  }

  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
    Obj o = new Obj();
    o.num(10);
    o.num(50);
    System.out.format("%tc%n", System.currentTimeMillis());
    System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    Obj ob = Obj.class.newInstance();
    ob.sample();
  }

}
