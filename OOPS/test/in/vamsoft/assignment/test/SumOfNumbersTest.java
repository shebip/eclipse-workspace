package in.vamsoft.assignment.test;

import in.vamsoft.assignment.SumOfNumbers;

public class SumOfNumbersTest {
  public static void main(String[] args) {
    SumOfNumbers s=new SumOfNumbers();
    s.sum(args[0]);
    s.sumWhile(args[0]);
  }
  
}
