package in.vamsoft.abstraction;
abstract class Animal
{
  abstract void soundOfAnimal();  // It is just an idea
  }
   
  class Cat extends Animal
  {
      void soundOfAnimal()
      {
          System.out.println("Meoh");
          //Implementation of the idea according to requirements of sub class
      }
  }
   
  class Dog extends Animal
  {
      void soundOfAnimal()
      {
          System.out.println("Bow Bow");
          //Implementation of the idea according to requirements of sub class
      }
  }

public class Abstraction1 {
  public static void main(String[] args) {
    Animal a=new Dog();
    a.soundOfAnimal();
    Animal a1=new Cat();
    a1.soundOfAnimal();
  }

}
