package in.vamsoft.assignment;

public class SumOfNumbers {
  /**
   * @param a Sum of numbers using for loop. 
   */
  public void sum(String a) {
    int n = Integer.parseInt(a);
    int sum = 0;
    for (int i = 1; i <= n; ++i) {
      sum += i;
    }
    System.out.println("Sum of numbers using for loop" + sum);
  }

  /**
   * @param a sum of number using while loop.
   */
  public void sumWhile(String a) {
    int n = Integer.parseInt(a);
    int i = 1; 
    int sum = 0;
    while (i <= n) {
      sum += i;
      ++i;
    }
    System.out.println("Sum of numbers using while loop " + sum);

  }

}