package in.vamsoft.assignment;

import java.util.Scanner;

public class CompoundInterest {
  public void calculateInterst() {
  double pr, rate, t, sim,com,num;
  Scanner sc=new Scanner (System. in);
  System.out.println("Enter the amount:");
  pr=sc.nextDouble();
  System. out. println("Enter the No.of years:");
  t=sc.nextDouble();
  System. out. println("Enter the Rate of  interest");
  rate=sc.nextDouble();
  sim=(pr * t * rate)/100;
  com=pr * Math.pow(1.0+rate/100.0,t) - pr;
  System.out.println("Simple Interest="+sim);
  System.out. println("Compound Interest="+com);
  System.out.print("Enter an integer number: ");
  num=sc.nextInt();

  System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
  System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));
  }

}
