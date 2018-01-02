package in.vamsoft.basics;
class  func{
  public void printName(String s) {
  System.out.println(s);    
  }
}
public class ClassExample {
  public void add() {
    int c=2+8;
    System.out.println(c);
  }
  public static void add1() {
    System.out.println("Inside static method");
  }

  public static void main(String[] args) {
    
    ClassExample c= new ClassExample();
    ClassExample.add1();
    c.add();
    func f=new func();
    f.printName("shebi");

  }

}
