package in.vamsoft.assignment.test;
import in.vamsoft.assignment.ArmstrongNumber;

public class ArmstrongNumberTest {

  public static void main(String[] args) {
    ArmstrongNumber ob = new ArmstrongNumber();
    int x = 153;
    System.out.println(ob.isArmstrong(x));
    x = 1253;
    System.out.println(ob.isArmstrong(x));
  }

}
