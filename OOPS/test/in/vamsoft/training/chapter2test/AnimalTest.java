package in.vamsoft.training.chapter2test;

import in.vamsoft.training.chapter2.Animal;
import in.vamsoft.training.chapter2.Horse;

public class AnimalTest {

  public static void main(String[] args) {
    Animal a = new Animal();
    a.eat();
    Horse h = new Horse();
    h.eat();
    Animal ah = new Horse();
    ah.eat();
    Horse he = new Horse();
    he.eat("Apples");
 
  }

}
