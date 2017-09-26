package in.vamsoft.training.chapter1test;

import in.vamsoft.training.chapter1.Zoo;

public class Chapter1Test {

  public static void main(String[] args) {

    /**
     * If the preceding line compiles Moo has access to the Zoo class But... does it
     * have access to the coolMethod()?
     */
    Zoo z = new Zoo();
    System.out.println("A Zoo says, " + z.coolMethod());

  }

}
