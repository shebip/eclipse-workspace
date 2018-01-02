
import java.text.*;
import java.util.*;

public class DateFormatExample {
  public static void main(String[] args) {
    SimpleDateFormat geek = new SimpleDateFormat("dd / MM / yy");
    Calendar c = Calendar.getInstance();
    System.out.println("Present Date : " + c.getTime());
    String formattedDate = geek.format(c.getTime());
    System.out.println("Date formatted : " + formattedDate);

  }
}