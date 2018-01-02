package in.vamsoft.assignment;

import java.util.Scanner;

public class PrimeNumber {
  /**
   * The method is used to check Prime number.
   */
  public void primeCheck() {
    System.out.println("Prime Number\nEnter the number");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = 2; i < num / 2; i++) {
      int temp = num % i;
      if (temp == 0) {
        System.out.println("The given number is not Prime");
      }

      else {
        System.out.println("The given number is prime");
      }
    }
  }
}
