package in.vamsoft.basics;

class Animal {
  int x=4;
  String color = "white";
}

class Dog extends Animal {
  String color = "black";

  void printColor() {
    System.out.println(color);// prints color of Dog class
    System.out.println(super.color);// prints color of Animal class
    System.out.println(System.getProperty("java.classpath"));;
  }
}

public class SuperExample {
  public static void main(String args[]) {
    Dog d = new Dog();
    d.printColor();
    Animal a=new Animal();
   
  }

}
