import java.util.*;

public class DynamicArray {
  public static void main(String[] arg) {
    ArrayList arr = new ArrayList();
    arr.add(3);
    arr.add("Hi");
    arr.add("welcome");
    arr.add(4);
    Vector v = new Vector();
    v.addAll(arr);
    System.out.println("vector v:" + v);
  }
}