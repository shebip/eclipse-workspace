package in.vamsoft.assignment.test;

public class ExceptionHandlingTest {

  public static void main(String[] args) {

    int i = 18;
    if (i <= 18) {
      try {
        throw new Exception("The Value is Invalid");
      } catch (Exception e) {

        System.err.println(e);

      }

    }
  }
}
