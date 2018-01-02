package in.vamsoft.arrays;

import java.util.Arrays;
import java.util.List;

public class TestArray {

  public static void main(String[] args) {
    double[] myList = {  3.4,1.9, 2.9, 3.5 };
 // Creates a wrapper list over ar[]
   // List<Double> l=new  Arrays.asList(myList);
    
    Arrays.sort(myList);
    System.out.println("After sort"+Arrays.toString(myList));
    for (double list : myList) {
      System.out.println(list);

    }

    int [][]ar = new int [3][4];
    
    // Fill each row with 10. 
    for (int[] row : ar)
        Arrays.fill(row, 10);

    System.out.println(Arrays.deepToString(ar));
    int[][] mul = { { 2, 8, 7 }, { 5, 7, 3 } };
    for(int[] row:mul) {
      System.out.println(Arrays.toString(row));
    }
//    
//    for (int i = 0; i <= mul.length; i++) {
//      for (int j = 0; j <= mul.length; j++) {
//        System.out.println(mul[i][j]);

  //    }
//    }
    for (int[] Mul : mul) {
      System.out.println(Mul);
    }

    TestArray arr = new TestArray();
    TestArray arr1 = new TestArray();
    TestArray arr2 = new TestArray();

    TestArray objList[] = { arr, arr1, arr2 };
  }
}