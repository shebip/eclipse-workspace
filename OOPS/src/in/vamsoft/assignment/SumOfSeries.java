package in.vamsoft.assignment;

import java.util.Scanner;

public class SumOfSeries {
  public void sumOfSeries() {
    float x,sum,term;
    int i,n;
    System.out.println("Enter the Value of x and (n)");
    Scanner s=new Scanner(System.in);
    x=s.nextFloat();
    n=s.nextInt();
    sum =1; term = 1;
    for (i=1;i<n;i++)
    {
     term = term*x/(float)i;
     sum =sum+ term;
    }
    System.out.println("\nSum\n"+sum+"\nNumber of terms\n"+n+"\nValue of X\n"+x);
  }

}
