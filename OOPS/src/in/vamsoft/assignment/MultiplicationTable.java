package in.vamsoft.assignment;

public class MultiplicationTable {
  
  /**
   * @param a Multiplication Table Using for loop.
   */
  public void multiply(String a) { 
    System.out.println("Enter value for Multiplication Table Using for loop");
    int n = Integer.parseInt(a);
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + "*" + n + "=" + i * n);
    }
  }

  /**
   * @param a Multiplication table using while loop.   */
  public void multiplyWhile(String a) {
    int n = Integer.parseInt(a);
    int n1 = 0;
    System.out.println("Enter value for Multiplication Table Using While loop");

    while (n1 <= 10) {
      n1 = n1 + 1;
      int m = n * n1;
      System.out.println(n+"*"+n1+"=" +m);

    }
  }

}
