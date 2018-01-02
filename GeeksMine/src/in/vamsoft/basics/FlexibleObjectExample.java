package in.vamsoft.basics;

public class FlexibleObjectExample {

  public static void main(String[] args) {
    Object y;
    y=1;
    System.out.println(y.getClass().getName());
    y="hi";
    System.out.println(y.getClass().getName());
    y=0.01;
    System.out.println(y.getClass());
    
  }

}
