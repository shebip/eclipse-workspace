package in.vamsoft.basics;


class A {

 public void add() {
   System.out.println("Class A");
 }
}

class B extends A{

 public void add() {
   super.add(); 
   System.out.println("Class B");
 }}
public class Overridding {

  public static void main(String[] args) {
    
   A a = new A(); 
    A b = new B(); 
    a.add();
    b.add();
  }
}
