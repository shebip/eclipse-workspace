package in.vamsoft.training.chapter2test;

import in.vamsoft.training.chapter2.Anim;
import in.vamsoft.training.chapter2.Dog;

class CastTest2 {
public static void main(String [] args) {
  Anim [] a = {new Anim(), new Dog(), new Anim() };
  for(Anim animal : a) {
  animal.makeNoise();
  if(animal instanceof Dog) {
    Dog d = (Dog) animal;
    d.playDead();
    }
}
}
} 