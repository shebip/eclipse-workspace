
import java.util.Random;

public final class RandomNumbers {

  public static final void main(String args[]) {
    Random randomGenerator = new Random();
    for (int idx = 1; idx <= 10; ++idx) {
      int randomInt = randomGenerator.nextInt(100);
      System.out.println("Generated : " + randomInt);
    }

    System.out.println("Done.");
  }

  private static void log(String aMessage) {
    System.out.println(aMessage);
  }
}
