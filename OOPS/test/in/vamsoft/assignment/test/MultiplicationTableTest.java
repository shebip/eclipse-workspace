package in.vamsoft.assignment.test;

import in.vamsoft.assignment.MultiplicationTable;

/**
 * @MultiplicationTable.
 * 
 * @author vamsoft.
 */
public class MultiplicationTableTest {
  /**
   * @param args
   *          to print multiplication of number.
   */
  public static void main(String[] args) {
    MultiplicationTable mul = new MultiplicationTable();
    mul.multiply(args[0]);
    mul.multiplyWhile(args[0]);

  }

}
