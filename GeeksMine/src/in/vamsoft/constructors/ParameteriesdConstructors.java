package in.vamsoft.constructors;

import java.util.Scanner;

public class ParameteriesdConstructors {
  int id;
  String name;

  public ParameteriesdConstructors(int id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public static void main(String[] args) {
    System.out.println("Enter name");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("Enter id");

    int id = scanner.nextInt();
    ParameteriesdConstructors obj = new ParameteriesdConstructors(id, name);
    
    
     
  }

}
