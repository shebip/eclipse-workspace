package in.vamsoft.geeks.encapsulation;

import java.util.Scanner;

public class Encapsulation {
  public Encapsulation() {
    super();
    this.name = name;
    
    this.salary = salary;
  }
  
  private String name;
   private double salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    System.out.println(name);
  }

  public double getSalary() {
    return salary;
    
  }
 

  public static void main(String[] args) {
    
    Encapsulation e=new Encapsulation();
    e.setName("shebi");
    Scanner s=new Scanner(System.in);
    s.nextDouble();
    
    e.getSalary();
    
   
  
    
   
    
    
   
  }

}
