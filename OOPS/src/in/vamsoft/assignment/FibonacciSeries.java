package in.vamsoft.assignment;

import java.util.Scanner;

public class FibonacciSeries {
  /**
   * This method is used to print fibonacci series.
   */
  public void fibonacci() {
    int num, a = 0, b = 1, temp;
    System.out.println("Enter Number of terms");
    Scanner scanner = new Scanner(System.in);
    num = scanner.nextInt();
    System.out.println("Fibonacci series");
    for (int i = 1; i <= num; ++i) {
      System.out.println(a);

      temp = a + b;
      a = b;
      b = temp;
    }

  }

}
