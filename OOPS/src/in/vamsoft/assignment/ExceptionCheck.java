package in.vamsoft.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionCheck {
  public void arithmeticCheck() {

    try {
      int a = 30, b = 0;
      int c = a / b;
      System.out.println("Result = " + c);
    } catch (ArithmeticException e) {
      System.out.println("Can't divide a number by 0");
    }
  }

  public void arrayCheck() {

    try {
      int a[] = new int[5];
      a[6] = 8;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index out of Bounds");
    }

  }

  public void fileCheck() {
    File file = new File("E://a.txt");
    try {
      FileReader reader = new FileReader(file);
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }

  public void numberCheck() {
    try {
      int a = Integer.parseInt("Shebi");
      System.out.println(a);
    } catch (NumberFormatException e) {
      System.out.println("Number format Exception");
    }
  }

  public void nullCheck() {
    try {
      String a = null;
      System.out.println(a.charAt(0));
    } catch (NullPointerException e) {
      System.out.println("Values should not be null");
    }

  }
}
