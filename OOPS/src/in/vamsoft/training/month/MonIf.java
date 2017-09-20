package in.vamsoft.training.month;

public class MonIf {
  int num = 2;
  String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "November",
      "December" };

  public void meth() {
    if (num >= 1 && num <= 12) {
      System.out.format("The name of month number %d is %s\n", num, months[num - 1]);
    } else {
      System.out.println("You have entered an invalid number");
    }

  }
}
